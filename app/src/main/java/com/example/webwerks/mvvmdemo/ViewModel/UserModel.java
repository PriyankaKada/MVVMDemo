package com.example.webwerks.mvvmdemo.ViewModel;

import android.databinding.BaseObservable;

import com.example.webwerks.mvvmdemo.Model.User;
import com.example.webwerks.mvvmdemo.R;

public class UserModel extends BaseObservable {
    private String email;
    private String password;
    private String email_hint;
    private String password_hint;



    public UserModel(User user){
        this.email_hint=user.email_hint;
        this.password_hint=user.password_hint;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

        notifyPropertyChanged(R.id.email_id);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.pass_id);
    }

    public String getEmail_hint() {
        return email_hint;
    }

    public void setEmail_hint(String email_hint) {
        this.email_hint = email_hint;
    }

    public String getPassword_hint() {
        return password_hint;
    }

    public void setPassword_hint(String password_hint) {
        this.password_hint = password_hint;
    }

}
