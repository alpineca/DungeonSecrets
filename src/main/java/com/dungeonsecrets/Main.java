package com.dungeonsecrets;

import com.dungeonsecrets.backEnd.processors.GetHeroList;
import com.dungeonsecrets.backEnd.utility.ImmortalFont;
import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;
import com.dungeonsecrets.sound.MusicManager;
import com.dungeonsecrets.sound.MusicThread;
import com.dungeonsecrets.backEnd.processors.APIConnect;
import com.mysql.cj.xdevapi.JsonArray;
import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.*;
import java.io.IOException;
import java.util.Iterator;

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
