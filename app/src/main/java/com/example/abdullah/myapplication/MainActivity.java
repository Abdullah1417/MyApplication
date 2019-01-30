package com.example.abdullah.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText Name,Email;
    ListView list;

    // Write a message to the database
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Emp");
    myRef.CompletionListener







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Name=(EditText) findViewById(R.id.name);
        //Email=(EditText) findViewById(R.id.email);

    }

    //@Override
    /*public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_acvitvy_men, menu);
        return true;
    }*/

    public void SignUp(View view) {
        startActivity(new Intent(MainActivity.this, signUp.class));

    }
    public void LoginFromHome(View view) {
        startActivity(new Intent(MainActivity.this, SignIn.class));

    }
    public void guest(View view) {
        startActivity(new Intent(MainActivity.this, Guest.class));

    }
    //ssssss
    }

