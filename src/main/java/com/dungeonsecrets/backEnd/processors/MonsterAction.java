package com.dungeonsecrets.backEnd.processors;

public class MonsterAction {

    public static void moveMonsters(){
//        try {
//            Thread.sleep(800);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        MonsterMoveProcessor.moveAllMonsters();
        TurnSelector.getInstance().toggle();
    }
}
