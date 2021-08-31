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
        System.out.println("SETTED DATA: "+ username + " : "+user_id);
    }

    public static CurrentUser getInstance(){
//        if(instance == null){
//            instance = new CurrentUser();
//        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public int getUser_id() {
        return this.user_id;
    }
}
