package com.dungeonsecrets.backEnd.processors;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CharacterCheck {


    public static boolean checkCharacters(String username){


        if(username.equals("Player")){

            return true;

        }

        return false;
    }

}
