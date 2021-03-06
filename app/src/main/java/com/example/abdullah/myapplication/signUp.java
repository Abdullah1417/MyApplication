package com.example.abdullah.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
public class signUp extends AppCompatActivity {

    //FirebaseAuth.AuthStateListener mAuthListner;

    private EditText inputEmail, inputPassword;
    private Button btnSignIn, btnSignUp, btnResetPassword;
    //بعدينprivate ProgressBar progressBar;
    private FirebaseAuth mAuth;
    //Here
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //Get Firebase auth instance
        mAuth = FirebaseAuth.getInstance();


        inputEmail = (EditText) findViewById(R.id.EmailReg);
        inputPassword = (EditText) findViewById(R.id.passReg);
        //progressBar = (ProgressBar) findViewById(R.id.progressBar); بعدين
        //btnResetPassword = (Button) findViewById(R.id.btn_reset_password); بعدين



    }
    public void reg(View view) {
        String email = inputEmail.getText().toString();
        String password = inputPassword.getText().toString();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password.length() < 6) {
            Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
            return;
        }

        //progressBar.setVisibility(View.VISIBLE);
        //create user


       mAuth.createUserWithEmailAndPassword(email, password)
                 .addOnCompleteListener(signUp.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Toast.makeText(signUp.this, "The registration is done" + task.isSuccessful(), Toast.LENGTH_SHORT).show();
                        //progressBar.setVisibility(View.GONE);


                        if (!task.isSuccessful()) {
                            Toast.makeText(signUp.this, "Authentication failed." + task.getException(),
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            startActivity(new Intent(signUp.this, MainActivity.class));
                            finish();
                        }
                    }
                });


    }

    public void Login(View view) {
        startActivity(new Intent(signUp.this, SignIn.class));
    }
    @Override
    protected void onResume() {
        super.onResume();
        //progressBar.setVisibility(View.GONE);
    }

}