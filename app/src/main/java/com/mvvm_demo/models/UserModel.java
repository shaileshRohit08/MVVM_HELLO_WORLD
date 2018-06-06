package com.mvvm_demo.models;

import android.databinding.ObservableField;

/**
 * Created by shailesh.rohit on 06-03-2018.
 */
public class UserModel {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String name="";
    public UserModel(String name)
    {
        this.name=name;
    }
    public ObservableField<String> title=new ObservableField<>();
}
