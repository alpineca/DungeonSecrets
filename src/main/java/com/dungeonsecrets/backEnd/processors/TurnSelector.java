package com.dungeonsecrets.backEnd.processors;

public class TurnSelector {
    private static TurnSelector instance;
    private boolean itsPlayerTurn   = true;

    private TurnSelector(){

    }

    public boolean isItsPlayerTurn() {
        return itsPlayerTurn;
    }

    public static TurnSelector getInstance() {
        if(instance == null){
            instance = new TurnSelector();
        }
        return instance;
    }

    public void toggle(){
        if(itsPlayerTurn){
            this.itsPlayerTurn = false;
            return;
        }

        this.itsPlayerTurn = true;
    }
}
