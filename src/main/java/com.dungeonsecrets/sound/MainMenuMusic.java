package com.dungeonsecrets.sound;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class MainMenuMusic {

    public static Clip clip;

    public MainMenuMusic() {

        try {

            URL url = this.getClass().getClassLoader().getResource("soundResources/MainMenuMusic.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);

            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();

            //No idea how this works, but I'm convinced its 50% black magic
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }

    }

    public static void stop(){

        clip.stop();

    }

}

