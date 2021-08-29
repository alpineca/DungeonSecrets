package com.dungeonsecrets.backEnd.processors;

import java.util.ArrayList;

public class GetHeroList {
    private static ArrayList<String> heroes = new ArrayList<>();

    //Query = select * from heroes where user_id = 77

    //Пълнене на масива с резултати от базата данни
//    while(userSet.next()){
//        heroes.add(userSet.getString("name"));
//    }

    public static ArrayList<String> getHeroesList(){
        //ONLY FOR TESTING
        if(heroes.isEmpty()){
            heroes.add("Clerko");
            heroes.add("Soccre");
        }

        return heroes;
    }
}
