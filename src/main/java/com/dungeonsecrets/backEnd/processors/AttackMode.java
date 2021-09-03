package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.gameGridObjects.Character;
import com.dungeonsecrets.backEnd.gameGridObjects.Monster;

public class AttackMode {
    public static void attackMonster(Monster focusedMonster){
        Character character = Character.getInstance();
        String charName     = character.getName();
        String monsName     = focusedMonster.getName();

        System.out.println("********************");
        System.out.println("********************");
        System.out.println(charName+" attacks -> "+monsName);


    }
}
