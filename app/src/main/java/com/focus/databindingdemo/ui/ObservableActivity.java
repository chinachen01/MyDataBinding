package com.focus.databindingdemo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;

import com.focus.databindingdemo.R;
import com.focus.databindingdemo.databinding.ActivityObservableBinding;
import com.focus.databindingdemo.model.ObservableUser;

/**
 * Created by focus on 16/9/22.
 */
public class ObservableActivity extends AppCompatActivity {
    private ObservableUser mUser;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObservableBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable);
        binding.observableFirstNameEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mUser.setFirstName(editable.toString());
            }
        });
        mUser = new ObservableUser();
        binding.setUser(mUser);
    }
}
