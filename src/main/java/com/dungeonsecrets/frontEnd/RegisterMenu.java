package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.enums.RegisterResult;
import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;
import com.dungeonsecrets.backEnd.processors.RegisterProcessor;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.sound.ButtonClickSound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

public class RegisterMenu extends JPanel{

    LoginAndRegisterBackground background = new LoginAndRegisterBackground();

    JLabel usernameLabel = new JLabel("Username:");
    JLabel emailLabel = new JLabel("Email:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel confirmPasswordLabel = new JLabel("Confirm password:");
    JLabel messageLabel = new JLabel();

    JTextField usernameField = new JTextField();
    JTextField emailField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JPasswordField confirmPasswordField = new JPasswordField();

    JLabel registerButton = new JLabel("REGISTER");
    JLabel cancelButton = new JLabel("CANCEL");

    public RegisterMenu(){

        //Labels

        usernameLabel.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)+60,300,30);
        usernameLabel.setFont(new Font("Immortal",Font.BOLD,30));
        usernameLabel.setForeground(new Color(111,0,0));
        usernameLabel.setHorizontalAlignment(JLabel.RIGHT);

        emailLabel.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)+100,300,30);
        emailLabel.setFont(new Font("Immortal",Font.BOLD,30));
        emailLabel.setForeground(new Color(111,0,0));
        emailLabel.setHorizontalAlignment(JLabel.RIGHT);

        passwordLabel.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)+140,300,30);
        passwordLabel.setFont(new Font("Immortal",Font.BOLD,30));
        passwordLabel.setForeground(new Color(111,0,0));
        passwordLabel.setHorizontalAlignment(JLabel.RIGHT);

        confirmPasswordLabel.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)+180,300,30);
        confirmPasswordLabel.setFont(new Font("Immortal",Font.BOLD,30));
        confirmPasswordLabel.setForeground(new Color(111,0,0));
        confirmPasswordLabel.setHorizontalAlignment(JLabel.RIGHT);

        messageLabel.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)+300,700,30);
        messageLabel.setFont(new Font("Immortal",Font.BOLD,30));
        messageLabel.setForeground(new Color(111,0,0));
        messageLabel.setHorizontalAlignment(JLabel.LEFT);

        //TextFields

        usernameField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+60,200,30);
        usernameField.setOpaque(true);
        usernameField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        usernameField.setForeground(new Color(111,0,0));
        usernameField.setBackground(new Color(196,153,80));
        usernameField.setFont(new Font("Immortal",Font.BOLD,30));

        emailField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+100,200,30);
        emailField.setOpaque(true);
        emailField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        emailField.setForeground(new Color(111,0,0));
        emailField.setBackground(new Color(196,153,80));
        emailField.setFont(new Font("Immortal",Font.BOLD,30));

        passwordField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+140,200,30);
        passwordField.setOpaque(true);
        passwordField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        passwordField.setForeground(new Color(111,0,0));
        passwordField.setBackground(new Color(196,153,80));
        passwordField.setFont(new Font("Immortal",Font.BOLD,30));

        confirmPasswordField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+180,200,30);
        confirmPasswordField.setOpaque(true);
        confirmPasswordField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        confirmPasswordField.setForeground(new Color(111,0,0));
        confirmPasswordField.setBackground(new Color(196,153,80));
        confirmPasswordField.setFont(new Font("Immortal",Font.BOLD,30));

        //Buttons

        registerButton.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+250,200,30);
        registerButton.setForeground(new Color(111,0,0));
        registerButton.setFont(new Font("Immortal",Font.BOLD,30));
        registerButton.setHorizontalAlignment(JLabel.RIGHT);
        registerButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ButtonClickSound();

                RegisterResult isRegistered = RegisterProcessor.doRegister(usernameField.getText(), passwordField.getText(), confirmPasswordField.getText(), emailField.getText());

                if(isRegistered.equals(RegisterResult.FAILED_REGISTERED)) {
                    messageLabel.setText("Failed registration!");
                }
                else if(isRegistered.equals(RegisterResult.USERNAME_EXIST)){
                    messageLabel.setText("Username already exist!");
                }
                else if(isRegistered.equals(RegisterResult.USERNAME_FAIL)){
                    messageLabel.setText("Username doesn't meet the requirements!");
                }
                else if(isRegistered.equals(RegisterResult.PASSWORD_FAIL)){
                    messageLabel.setText("Password doesn't meet the requirements!");
                }
                else if(isRegistered.equals(RegisterResult.PASSWORD_NOT_MATCH)){
                    messageLabel.setText("Passwords not matches!");
                }
                else if(isRegistered.equals(RegisterResult.EMAIL_FAIL)){
                    messageLabel.setText("Email doesn't meet the requirements!");
                }
                else if(isRegistered.equals(RegisterResult.EMAIL_EXIST)){
                    messageLabel.setText("Email already exist!");
                }
                else if(isRegistered.equals(RegisterResult.REGISTERED)){
                    messageLabel.setText(String.valueOf(RegisterResult.REGISTERED) + " - Redirecting");

                    Timer timer = new Timer();
                    TimerTask task = new TimerTask() {
                        @Override
                        public void run() {
                            MainFrame.closeRegisterMenu();

                        }
                    };
                    MainFrame.openLoginMenu();
                    timer.schedule(task, 2000);
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

        cancelButton.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)+250,300,30);
        cancelButton.setForeground(new Color(111,0,0));
        cancelButton.setFont(new Font("Immortal",Font.BOLD,30));
        cancelButton.setHorizontalAlignment(JLabel.RIGHT);
        cancelButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ButtonClickSound();
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

        this.add(messageLabel);
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
