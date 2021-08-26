package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.enums.LoginResult;
import com.dungeonsecrets.backEnd.utility.ConnectDatabase;
import com.dungeonsecrets.backEnd.utility.PasswordHash;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginProcessor {

    private static final String loginQuery = "SELECT * FROM account WHERE user_name = ? and password = ?";

    public static LoginResult doLogin(String username, String password) {
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st  = connection.prepareStatement(loginQuery);

            password = PasswordHash.passwordHash(password);

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
}
