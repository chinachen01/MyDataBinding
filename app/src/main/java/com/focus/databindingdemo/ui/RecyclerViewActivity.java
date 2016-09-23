package com.focus.databindingdemo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.focus.databindingdemo.R;
import com.focus.databindingdemo.adapter.RecyclerAdapter;
import com.focus.databindingdemo.databinding.ActivityRecyclerviewBinding;
import com.focus.databindingdemo.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyong on 16-9-22.
 */

public class RecyclerViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerviewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(linearLayoutManager);
        binding.recyclerView.setAdapter(new RecyclerAdapter(processList()));
    }

    private List<User> processList() {
        List<User> list = new ArrayList<>();
        User user = new User("Li", "Si");
        list.add(user);
        user = new User("Wang", "Wu");
        user.setVisible(true);
        list.add(user);
        user = new User("Zhang", "QI");
        list.add(user);
        return list;
    }
}
