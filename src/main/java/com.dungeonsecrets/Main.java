package com.dungeonsecrets;

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

    }

}
