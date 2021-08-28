package com.dungeonsecrets.sound;

public class MusicThread extends Thread{

    @Override
    public void run(){
        //System.out.println("Music thread is running");
    }

    public void startMusic(String musicPath){
       // System.out.println("Music thread is running:2");
        new MusicManager(musicPath);

    }

    public static void stopMusic(){

        MusicManager.stop();

    }


//    MusicThread.stopMusic();      STOP
//    MusicManager.music = new MusicThread();      START NEW
//    MusicManager.music.startMusic("soundResources/CalmOutdoors.wav");     ADD FILE

}
