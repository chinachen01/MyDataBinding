package com.focus.databindingdemo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.focus.databindingdemo.R;
import com.focus.databindingdemo.databinding.ActivityBasicBinding;
import com.focus.databindingdemo.listeners.IOkListener;
import com.focus.databindingdemo.model.User;

/**
 * Created by focus on 16/9/22.
 */
public class BasicActivity extends AppCompatActivity implements IOkListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_basic);
        User user = new User("li", "si");
        user.setVisible(true);
        binding.setUser(user);
        binding.setMiddleName("bu");
    }

    @Override
    public void onOkClick(View view) {
        Log.d("tag", "click button");
    }
}
