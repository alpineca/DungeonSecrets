package com.dungeonsecrets.sound;

public class MusicThread extends Thread{

    @Override
    public void run(){
        System.out.println("Music thread is running");
    }

    public void startMusic(String musicPath){
        System.out.println("Music thread is running");
        MusicManager music = new MusicManager(musicPath);

    }

    public static void stopMusic(){

        MusicManager.stop();

    }

}
