package com.dungeonsecrets.sound;

import javax.sound.sampled.*;
import java.io.IOException;
import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class ButtonClickSound {

    // USE this : menuButtonOptions.addActionListener(e -> new ButtonClickSound());
    //Important Note: Sound has to change cuz I jacked it from Mount&Blade Warband on Steam

    public ButtonClickSound() {

        try {

            URL url = this.getClass().getClassLoader().getResource("soundResources/MenuClickSound.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);

            Clip clip = AudioSystem.getClip();

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

}




















//uhhh i have to do the chat and the other things now that tilt me why i dont want to plz help unless i go for music which i might hope noone sees this and if you do hi

