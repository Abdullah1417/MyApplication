package com.example.abdullah.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Post extends AppCompatActivity {

    private String id;
    private String title;
    private String contet;
//    private Comment comments;

    public Post(){

    }


    public Post(String id, String title, String content ) {

        this.id = id;
        this.title = title;
        this.contet = content;
//        this.comments = comments;
    }


    public String getTitlee() {
        return title;
    }

    public String getContet() {
        return contet;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContet(String contet) {
        this.contet = contet;
    }

    public String getId() {
        return id;
    }


//    public void setComments(Comment comments) {
//        this.comments = comments;
//    }
//
//    public Comment getComments() {
//        return comments;
//    }

}
