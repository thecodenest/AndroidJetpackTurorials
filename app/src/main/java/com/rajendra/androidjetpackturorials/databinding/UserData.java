package com.rajendra.androidjetpackturorials.databinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.rajendra.androidjetpackturorials.BR;

public class UserData extends BaseObservable {

    String name;
    String email;

    public UserData(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        notifyPropertyChanged(BR.name);
        this.name = name;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        notifyPropertyChanged(BR.email);
        this.email = email;
    }
}
