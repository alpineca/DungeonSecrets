package com.dungeonsecrets.frontEnd;

import MainFrame.MainFrame;
import com.dungeonsecrets.backEnd.processors.AuthProcessor;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RegisterMenu extends JPanel{

    LoginAndRegisterBackground background = new LoginAndRegisterBackground();

    JLabel message = new JLabel();
    JLabel usernameLabel = new JLabel("Username:");
    JLabel emailLabel = new JLabel("Email:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel confirmPasswordLabel = new JLabel("Confirm password:");

    JTextField usernameField = new JTextField();
    JTextField emailField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JPasswordField confirmPasswordField = new JPasswordField();

    JLabel registerButton = new JLabel("REGISTER");
    JLabel cancelButton = new JLabel("CANCEL");

    public RegisterMenu(){

        //Labels

        usernameLabel.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)-25,300,30);
        usernameLabel.setFont(new Font("Immortal",Font.BOLD,30));
        usernameLabel.setForeground(new Color(111,0,0));
        usernameLabel.setHorizontalAlignment(JLabel.RIGHT);

        emailLabel.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)+15,300,30);
        emailLabel.setFont(new Font("Immortal",Font.BOLD,30));
        emailLabel.setForeground(new Color(111,0,0));
        emailLabel.setHorizontalAlignment(JLabel.RIGHT);

        passwordLabel.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)+55,300,30);
        passwordLabel.setFont(new Font("Immortal",Font.BOLD,30));
        passwordLabel.setForeground(new Color(111,0,0));
        passwordLabel.setHorizontalAlignment(JLabel.RIGHT);

        confirmPasswordLabel.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)+90,300,30);
        confirmPasswordLabel.setFont(new Font("Immortal",Font.BOLD,30));
        confirmPasswordLabel.setForeground(new Color(111,0,0));
        confirmPasswordLabel.setHorizontalAlignment(JLabel.RIGHT);

        //TextFields

        usernameField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)-25,200,30);
        usernameField.setOpaque(true);
        usernameField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        usernameField.setForeground(new Color(111,0,0));
        usernameField.setBackground(new Color(196,153,80));
        usernameField.setFont(new Font("Immortal",Font.BOLD,30));

        emailField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+15,200,30);
        emailField.setOpaque(true);
        emailField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        emailField.setForeground(new Color(111,0,0));
        emailField.setBackground(new Color(196,153,80));
        emailField.setFont(new Font("Immortal",Font.BOLD,30));

        passwordField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+55,200,30);
        passwordField.setOpaque(true);
        passwordField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        passwordField.setForeground(new Color(111,0,0));
        passwordField.setBackground(new Color(196,153,80));
        passwordField.setFont(new Font("Immortal",Font.BOLD,30));

        confirmPasswordField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+90,200,30);
        confirmPasswordField.setOpaque(true);
        confirmPasswordField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        confirmPasswordField.setForeground(new Color(111,0,0));
        confirmPasswordField.setBackground(new Color(196,153,80));
        confirmPasswordField.setFont(new Font("Immortal",Font.BOLD,30));

        //Buttons

        registerButton.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+170,200,30);
        registerButton.setForeground(new Color(111,0,0));
        registerButton.setFont(new Font("Immortal",Font.BOLD,30));
        registerButton.setHorizontalAlignment(JLabel.RIGHT);
        registerButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                boolean isRegistered = AuthProcessor.doRegister();

                if(isRegistered){
                    message.setText("Registered");
                }
                else{
                    message.setText("Error - Try again");
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
                registerButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                registerButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        cancelButton.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)+170,300,30);
        cancelButton.setForeground(new Color(111,0,0));
        cancelButton.setFont(new Font("Immortal",Font.BOLD,30));
        cancelButton.setHorizontalAlignment(JLabel.RIGHT);
        cancelButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MainFrame.closeRegisterMenu();
                MainFrame.openLoginMenu();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cancelButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cancelButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        this.add(message);
        this.add(registerButton);
        this.add(cancelButton);
        this.add(usernameLabel);
        this.add(emailLabel);
        this.add(passwordLabel);
        this.add(confirmPasswordLabel);
        this.add(usernameField);
        this.add(emailField);
        this.add(passwordField);
        this.add(confirmPasswordField);
        this.add(background);

    }

}
