package com.focus.databindingdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.focus.databindingdemo.ui.BasicActivity;
import com.focus.databindingdemo.ui.ObservableActivity;
import com.focus.databindingdemo.ui.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBasic(View view) {
        startActivity(new Intent(this, BasicActivity.class));
    }

    public void openObservable(View view) {
        startActivity(new Intent(this, ObservableActivity.class));
    }

    public void openRecyclerView(View view) {
        startActivity(new Intent(this, RecyclerViewActivity.class));
    }
}
