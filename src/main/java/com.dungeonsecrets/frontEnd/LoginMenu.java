package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.GameInfo.CurrentUser;
import com.dungeonsecrets.backEnd.enums.LoginResult;
import com.dungeonsecrets.backEnd.processors.LoginProcessor;
import com.dungeonsecrets.backEnd.processors.RegisterProcessor;
import com.dungeonsecrets.backEnd.utility.ImmortalFont;
import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.sound.ButtonClickSound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginMenu extends JPanel {

    LoginAndRegisterBackground background = new LoginAndRegisterBackground();

    JLabel usernameLabel            = new JLabel("Username: ");
    JLabel passwordLabel            = new JLabel("Password: ");
    JLabel messageLabel             = new JLabel();
    JTextField usernameField        = new JTextField();
    JPasswordField  passwordField   = new JPasswordField ();
    JLabel loginButton              = new JLabel("LOGIN");
    JLabel registerButton           = new JLabel("REGISTER");
    Font immortal;

    {
        try {
            immortal = new ImmortalFont().getFont();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public LoginMenu (){

        usernameLabel.setBounds((ScreenResolution.getScreenWidth()/2)-200,(ScreenResolution.getScreenHeight()/2)+60,200,30);
        usernameLabel.setFont(new Font("Immortal",Font.BOLD,30));
        usernameLabel.setForeground(new Color(111,0,0));
        usernameLabel.setHorizontalAlignment(JLabel.RIGHT);

        passwordLabel.setBounds((ScreenResolution.getScreenWidth()/2)-200,(ScreenResolution.getScreenHeight()/2)+120,200,30);
        passwordLabel.setFont(new Font("Immortal",Font.BOLD,30));
        passwordLabel.setForeground(new Color(111,0,0));
        passwordLabel.setHorizontalAlignment(JLabel.RIGHT);

        messageLabel.setBounds((ScreenResolution.getScreenWidth()/2)-200,(ScreenResolution.getScreenHeight()/2)+230,400,30);
        messageLabel.setFont(new Font("Immortal",Font.BOLD,30));
        messageLabel.setForeground(new Color(111,0,0));
        messageLabel.setHorizontalAlignment(JLabel.CENTER);

        usernameField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+60,200,30);
        usernameField.setOpaque(true);
        usernameField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        usernameField.setForeground(new Color(111,0,0));
        usernameField.setBackground(new Color(196,153,80));
        usernameField.setFont(new Font("Immortal",Font.BOLD,30));

        passwordField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+120,200,30);
        passwordField.setOpaque(true);
        passwordField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        passwordField.setForeground(new Color(111,0,0));
        passwordField.setBackground(new Color(196,153,80));
        passwordField.setFont(new Font("Immortal",Font.BOLD,30));

        loginButton.setBounds((ScreenResolution.getScreenWidth()/2)-200,(ScreenResolution.getScreenHeight()/2)+180,200,30);
        loginButton.setForeground(new Color(111,0,0));
        loginButton.setFont(new Font("Immortal",Font.BOLD,30));
        loginButton.setHorizontalAlignment(JLabel.RIGHT);
        loginButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                new ButtonClickSound();
                LoginResult isLogin;

                //TEMPORARY FOR OFFLINE TESTING
                if(usernameField.getText().equals("offline")){
                    isLogin = LoginResult.SUCCESSFUL_LOGIN;
                }else{
                    isLogin = LoginProcessor.doLogin(usernameField.getText(), passwordField.getText());

                }



//                LoginResult isLogin = AuthProcessor.doLogin(usernameField.getText(), passwordField.getText());

                if(isLogin.equals(LoginResult.SUCCESSFUL_LOGIN)){
                    MainFrame.closeLoginMenu();
                    MainFrame.openMainMenu();
                }
                else{
                    messageLabel.setText("Try again!");
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                loginButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        registerButton.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+180,200,30);
        registerButton.setForeground(new Color(111,0,0));
        registerButton.setFont(new Font("Immortal",Font.BOLD,30));
        registerButton.setHorizontalAlignment(JLabel.RIGHT);
        registerButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ButtonClickSound();
                MainFrame.closeLoginMenu();
                MainFrame.openRegisterMenu();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                registerButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                registerButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        this.add(messageLabel);
        this.add(registerButton);
        this.add(loginButton);
        this.add(usernameField);
        this.add(passwordField);
        this.add(usernameLabel);
        this.add(passwordLabel);
        this.add(background);
    }



}
