package com.example.abdullah.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PostActivityy extends AppCompatActivity {

    static FirebaseDatabase database = FirebaseDatabase.getInstance();
    static DatabaseReference myRef   = database.getReference("Posts");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

    }

    public void postClick(View view) {

        EditText titleEditText = (EditText)findViewById(R.id.titleEditText);
        EditText contentEditText = (EditText)findViewById(R.id.contentEditText);

        String title = titleEditText.getText().toString();
        String content = contentEditText.getText().toString();

        if (title.isEmpty() == false && content.isEmpty() == false){

            String id = myRef.push().getKey();

            Post post = new Post(id,title,content);
            myRef.child(id).setValue(post);
            Toast.makeText(getApplicationContext(),"post:"+post,Toast.LENGTH_LONG).show();


            Intent intent = new Intent(this , MainActivity.class);
            startActivity(intent);

        }else {

            Toast.makeText(this,"Empty",Toast.LENGTH_LONG).show();
        }


    }
}