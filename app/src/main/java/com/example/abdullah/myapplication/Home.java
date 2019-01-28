package com.example.abdullah.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void SignUp(View view) {
        startActivity(new Intent(Home.this, signUp.class));

    }
    public void Login(View view) {
        startActivity(new Intent(Home.this, MainActivity.class));

    }
    public void guest(View view) {
        startActivity(new Intent(Home.this, Guest.class));

    }

}
