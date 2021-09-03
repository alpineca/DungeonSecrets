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

    }

}
