package com.company;

import java.util.ArrayList;

public class User {
    //has-a:
    //String avatarUrl
    //String username
    //String name
    //String email

    //Post[] posts

    //can-do:
    //Constructor
    //toString

    //void addPost(Post p)

    String avatarUrl,userName, email;
    String name="none";
    ArrayList<Post> postList = new ArrayList<>();

    public User(String avatarUrl,String userName,String name,String email){
        this.avatarUrl=avatarUrl;
        this.userName=userName;
        this.name=name;
        this.email=email;
    }

    public void addPost(Post p){

        this.postList.add(p);
    }


}
