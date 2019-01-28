package com.example.abdullah.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

class read  extends AppCompatActivity implements ValueEventListener  {
    //TextView textShow=(TextView) findViewById(R.id.text1);
    @Override
    public void onDataChange( DataSnapshot dataSnapshot) {
        // This method is called once with the initial value and again
        // whenever data at this location is updated.
        String value = dataSnapshot.getValue(String.class);
        //textShow.setText(value);

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
    // Read from the database

}