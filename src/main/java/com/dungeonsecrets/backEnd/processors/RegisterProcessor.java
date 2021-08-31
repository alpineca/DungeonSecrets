package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.enums.RegisterResult;
import com.dungeonsecrets.backEnd.utility.ConnectDatabase;
import com.dungeonsecrets.backEnd.utility.PasswordHash;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterProcessor {

    private static final String registerQuery = "INSERT INTO account values (?,?,?,?)";
    private static final String usernameQuery = "SELECT * FROM account WHERE user_name = ?";
    private static final String passwordQuery = "SELECT * FROM account WHERE password  = ?";
    private static final String emailQuery    = "SELECT * FROM account WHERE email_id  = ?";

    public static RegisterResult doRegister(String username, String password,
                                            String confirmPassword, String emailId) {
        String userId             = null;
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement pst = connection.prepareStatement(registerQuery);

            pst.setString(1, userId);
            pst.setString(2, username);
            pst.setString(3, PasswordHash.passwordHash(password));
            pst.setString(4, emailId);

            if(username.trim().isEmpty()
                    || password.trim().isEmpty()
                    || confirmPassword.trim().isEmpty()
                    || emailId.trim().isEmpty()) {
                return RegisterResult.FAILED_REGISTERED;
            }
            else if(isUsernameExist(username)){
                return RegisterResult.USERNAME_EXIST;
            }
            else if(!isUsernameValid(username)){
                return RegisterResult.USERNAME_FAIL;
            }
            else if(!(isPasswordValid(password))){
                return RegisterResult.PASSWORD_FAIL;
            }
            else if(!(password.equals(confirmPassword))){
                return RegisterResult.PASSWORD_NOT_MATCH;
            }
            else if(!isEmailValid(emailId)){
                return RegisterResult.EMAIL_FAIL;
            }
            else if(isEmailExist(emailId)){
                return RegisterResult.EMAIL_EXIST;
            }
            else{
                pst.executeUpdate();
                return RegisterResult.REGISTERED;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return RegisterResult.SQL_ERROR;
    }

    private static boolean isUsernameExist(String username){
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st  = connection.prepareStatement(usernameQuery);

            st.setString(1, username);
            ResultSet rs          = st.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }

    private static boolean isUsernameValid(String username){

        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st  = connection.prepareStatement(usernameQuery);

            st.setString(1, username);
            String usernamePattern = "^[a-z0-9_-]{3,15}$";
            Pattern pattern        = Pattern.compile(usernamePattern);
            Matcher matcher        = pattern.matcher(username);

            if (matcher.matches()) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }

    private static boolean isPasswordValid(String password){
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st  = connection.prepareStatement(passwordQuery);

            st.setString(1, password);
            String passwordPattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20})";
            Pattern pattern        = Pattern.compile(passwordPattern);
            Matcher matcher        = pattern.matcher(password);

            if (matcher.matches()) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }

    private static boolean isEmailValid(String emailId) {
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st  = connection.prepareStatement(emailQuery);

            st.setString(1, emailId);
            String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+" +
                    "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            Pattern pattern     = Pattern.compile(emailPattern);
            Matcher matcher     = pattern.matcher(emailId);

            if (matcher.matches()) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }

    private static boolean isEmailExist(String emailId){
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st  = connection.prepareStatement(emailQuery);

            st.setString(1, emailId);
            ResultSet rs          = st.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }
}




