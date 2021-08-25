package com.dungeonsecrets.sound;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class MusicThread extends Thread{

    @Override
    public void run(){
        System.out.println("Music thread is running");
        MainMenuMusic music = new MainMenuMusic();

    }

    public static void stopMusic(){

        MainMenuMusic.stop();

    }

}
