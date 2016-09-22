package com.focus.databindingdemo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.focus.databindingdemo.BR;

/**
 * Created by focus on 16/9/22.
 */
public class ObservableUser extends BaseObservable {
    private String firstName;
    private String lastName;
    @Bindable
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
