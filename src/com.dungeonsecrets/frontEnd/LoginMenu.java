package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.enums.LoginResult;
import com.dungeonsecrets.backEnd.enums.RegisterResult;
import com.dungeonsecrets.backEnd.processors.AuthProcessor;
import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginMenu extends JPanel {

    LoginAndRegisterBackground background = new LoginAndRegisterBackground();

    JLabel usernameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");

    JTextField usernameField = new JTextField();
    JPasswordField  passwordField = new JPasswordField ();

    JLabel loginButton = new JLabel("LOGIN");
    JLabel registerButton = new JLabel("REGISTER");

    public LoginMenu (){

        usernameLabel.setBounds((ScreenResolution.getScreenWidth()/2)-200,(ScreenResolution.getScreenHeight()/2)-25,200,30);
        usernameLabel.setFont(new Font("Immortal",Font.BOLD,30));
        usernameLabel.setForeground(new Color(111,0,0));
        usernameLabel.setHorizontalAlignment(JLabel.RIGHT);

        passwordLabel.setBounds((ScreenResolution.getScreenWidth()/2)-200,(ScreenResolution.getScreenHeight()/2)+15,200,30);
        passwordLabel.setFont(new Font("Immortal",Font.BOLD,30));
        passwordLabel.setForeground(new Color(111,0,0));
        passwordLabel.setHorizontalAlignment(JLabel.RIGHT);

        usernameField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)-25,200,30);
        usernameField.setOpaque(true);
        usernameField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        usernameField.setForeground(new Color(111,0,0));
        usernameField.setBackground(new Color(196,153,80));
        usernameField.setFont(new Font("Immortal",Font.BOLD,30));

        passwordField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+15,200,30);
        passwordField.setOpaque(true);
        passwordField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        passwordField.setForeground(new Color(111,0,0));
        passwordField.setBackground(new Color(196,153,80));
        passwordField.setFont(new Font("Immortal",Font.BOLD,30));

        loginButton.setBounds((ScreenResolution.getScreenWidth()/2)-200,(ScreenResolution.getScreenHeight()/2)+80,200,30);
        loginButton.setForeground(new Color(111,0,0));
        loginButton.setFont(new Font("Immortal",Font.BOLD,30));
        loginButton.setHorizontalAlignment(JLabel.RIGHT);
        loginButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                LoginResult isLogin = AuthProcessor.doLogin(usernameField.getText(), passwordField.getText());

                MainFrame.closeLoginMenu();
                MainFrame.openMainMenu();

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

        registerButton.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+80,200,30);
        registerButton.setForeground(new Color(111,0,0));
        registerButton.setFont(new Font("Immortal",Font.BOLD,30));
        registerButton.setHorizontalAlignment(JLabel.RIGHT);
        registerButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
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

        this.add(registerButton);
        this.add(loginButton);
        this.add(usernameField);
        this.add(passwordField);
        this.add(usernameLabel);
        this.add(passwordLabel);
        this.add(background);
    }



}
