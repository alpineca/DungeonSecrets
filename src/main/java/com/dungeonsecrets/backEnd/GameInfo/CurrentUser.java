package com.dungeonsecrets.backEnd.GameInfo;

public class CurrentUser {
    private String username;
    private int user_id;
    private static CurrentUser instance = new CurrentUser();


    private CurrentUser(){

    }

    public void userInit(String username, int user_id){
        this.username   = username;
        this.user_id    = user_id;
    }

    public static CurrentUser getInstance(){
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public int getUser_id() {
        return user_id;
    }
}
