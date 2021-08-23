package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.enums.LoginResult;
import com.dungeonsecrets.backEnd.enums.RegisterResult;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthProcessor {

    public static RegisterResult doRegister(String username, String password, String confirmPassword, String emailId){
        String userId = null;

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/yWrPkFmrrx","yWrPkFmrrx", "n070mBUsFt");
            PreparedStatement pst = connection.prepareStatement("INSERT INTO account values (?,?,?,?,?)");

            pst.setString(1, userId);
            pst.setString(2, username);
            pst.setString(3, password);
            pst.setString(4, confirmPassword);
            pst.setString(5, emailId);

            if(checkExistUsername(username)){
                return RegisterResult.USERNAME_EXIST;
            }
            else if(!checkUsernameLength(username)){
                return RegisterResult.USERNAME_FAIL;
            }
            else if(!(checkPasswordLength(password))){
                return RegisterResult.PASSWORD_FAIL;
            }
            else if(!(password.equals(confirmPassword))){
                return RegisterResult.PASSWORD_NOT_MATCH;
            }
            else if(!checkValidEmail(emailId)){
                return RegisterResult.EMAIL_FAIL;
            }
            else if(checkExistEmail(emailId)){
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


    public static LoginResult doLogin(String username, String password){
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/yWrPkFmrrx","yWrPkFmrrx", "n070mBUsFt");

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("SELECT * FROM account WHERE user_name = ? and password = ?");

            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return LoginResult.SUCCESSFUL_LOGIN;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return LoginResult.FAILED_LOGIN;
    }


    private static boolean checkExistUsername(String username){
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/yWrPkFmrrx","yWrPkFmrrx", "n070mBUsFt");
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("SELECT * FROM account WHERE user_name =?");

            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }

    private static boolean checkUsernameLength(String username){

        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/yWrPkFmrrx","yWrPkFmrrx", "n070mBUsFt");

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("SELECT * FROM account WHERE user_name =?");

            st.setString(1, username);
            String usernamePattern = "^[a-z0-9_-]{3,15}$";

            Pattern pattern = Pattern.compile(usernamePattern);
            Matcher matcher = pattern.matcher(username);

            if (matcher.matches()) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }

    private static boolean checkPasswordLength(String password){
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/yWrPkFmrrx","yWrPkFmrrx", "n070mBUsFt");

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("SELECT * FROM account WHERE password =?");

            st.setString(1, password);
            String passwordPattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20})";

            Pattern pattern = Pattern.compile(passwordPattern);
            Matcher matcher = pattern.matcher(password);

            if (matcher.matches()) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }

    private static boolean checkValidEmail(String emailId) {
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/yWrPkFmrrx","yWrPkFmrrx", "n070mBUsFt");

            PreparedStatement st = (PreparedStatement) connection.prepareStatement("SELECT * FROM account WHERE email_id =?");

            st.setString(1, emailId);
            String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

            Pattern pattern = Pattern.compile(emailPattern);
            Matcher matcher = pattern.matcher(emailId);

            if (matcher.matches()) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }

    private static boolean checkExistEmail(String emailId){
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/yWrPkFmrrx","yWrPkFmrrx", "n070mBUsFt");
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("SELECT * FROM account WHERE email_id =?");

            st.setString(1, emailId);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }
}




