package com.dungeonsecrets;

import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;
import com.dungeonsecrets.sound.MusicManager;
import com.dungeonsecrets.sound.MusicThread;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MainFrame mainFrame = new MainFrame();

        MusicManager.music = new MusicThread();
        MusicManager.music.startMusic("soundResources/MainMenuMusic.wav");


//        String hit_dice = "18d10";
//        String[] hit_dice_param = hit_dice.split("d");
//        int dicesCount = Integer.parseInt(hit_dice_param[0]);
//        int diceWalls  = Integer.parseInt(hit_dice_param[1]);
//
//        System.out.println("Hit dice: " + hit_dice);
//        System.out.println("Dices count: " + dicesCount);
//        System.out.println("Dice walls: " + diceWalls);

    }

}
