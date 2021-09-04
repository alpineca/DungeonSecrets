package com.dungeonsecrets.backEnd.objects;

public class HitDice {
    private String hit_dice;
    private int throwsCount;
    private int diceSides;
    private int maxHitPoints;

    public HitDice(String hit_dice){
        this.hit_dice = hit_dice;
        this.splitter();
    }

    public String getHitDice() {
        return this.hit_dice;
    }

    public int getThrowsCount() {
        return this.throwsCount;
    }

    public int getDiceSides() {
        return this.diceSides;
    }

    public int getHitPoints(){
        return 0;
    }

    public int getDiceResult(){
        int min = this.throwsCount;
        int max = getMaxHitPoints();

        int diceResult = (int) ((Math.random() * (max - min)) + min);

        return diceResult;
    }

    private int getMaxHitPoints() {
        this.maxHitPoints = this.throwsCount * this.diceSides;
        return this.maxHitPoints;
    }

    private void splitter(){
        String[] hit_dice_param = this.hit_dice.split("d");
        this.throwsCount    = Integer.parseInt(hit_dice_param[0]);
        this.diceSides      = Integer.parseInt(hit_dice_param[1]);
    }

}
