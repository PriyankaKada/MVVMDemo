package com.example.webwerks.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.webwerks.mvvmdemo.Commands.userLogin;
import com.example.webwerks.mvvmdemo.Model.User;
import com.example.webwerks.mvvmdemo.ViewModel.UserModel;
import com.example.webwerks.mvvmdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserModel userModel=new UserModel(new User("Email","Password"));

        activityMainBinding.setLogin(userModel);
        activityMainBinding.setUserloginevent(new userLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this, "  "+activityMainBinding.getLogin().getEmail(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}
