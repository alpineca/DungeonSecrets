package com.dungeonsecrets.backEnd.processors;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MonsterAction implements Runnable{

    public MonsterAction(){

    }

    public static void moveMonsters(){
        int randomDecisionTime = new Random().nextInt(3);
        try {
            TimeUnit.SECONDS.sleep(randomDecisionTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MonsterMoveProcessor.moveAllMonsters();
        TurnSelector.getInstance().toggle();
    }

    @Override
    public void run() {
        moveMonsters();
    }
}
