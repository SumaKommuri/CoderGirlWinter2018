package com.company;

public class Post {

    //has a:
    //User user who posted it
    //int number(represents order)
    //String contents
    //String url

    User user;
    int numberOfPost=0;
    String postContent, url;


    //can-do:
    //constructor
    //toString

    //int getPostNumber()

    public Post(User user, String postContent, String url){
        this.postContent=postContent;
        this.url=url;
        this.user=user;

    }
}
