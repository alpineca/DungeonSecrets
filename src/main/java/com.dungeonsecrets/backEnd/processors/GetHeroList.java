package com.dungeonsecrets.backEnd.processors;

import java.util.ArrayList;

public class GetHeroList {
    private static ArrayList<String> heroes;
    //Query = select * from heroes where user_id = 77

    //Пълнене на масива с резултати от базата данни
//    while(userSet.next()){
//        heroes.add(userSet.getString("name"));
//    }

    public static ArrayList<String> getHeroesList(){
        return heroes;
    }
}
