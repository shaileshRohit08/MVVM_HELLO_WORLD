package com.mvvm_demo.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mvvm_demo.R;
import com.mvvm_demo.databinding.ActivityMainBinding;
import com.mvvm_demo.models.UserModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private UserModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        model=new UserModel("Hello");
        model.title.set("Hello World");
        binding.setUser(model);
        binding.btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.title.set("Bye world");
            }
        });
    }
}
