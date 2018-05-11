package com.example.webwerks.mvvmdemo.Model;

public class User {
    private String email;
    private String password;
    public String email_hint;
    public String password_hint;

    public User(String email_hint, String password_hint) {
        this.email_hint = email_hint;
        this.password_hint = password_hint;
    }
}
