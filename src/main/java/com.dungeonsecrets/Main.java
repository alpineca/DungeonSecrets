package com.dungeonsecrets;

import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;
import com.dungeonsecrets.sound.MusicManager;
import com.dungeonsecrets.sound.MusicThread;

public class Main {



    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        // MUSIC: Works if you remove the comment, I will leave them like this in order not to scare someone(VolumeWarning)-
        // MUSIC: it also stops when you transition to the game.(Doesn't interfere with Click sound)
        MusicManager.music = new MusicThread();
        MusicManager.music.startMusic("soundResources/MainMenuMusic.wav");
    }

}
