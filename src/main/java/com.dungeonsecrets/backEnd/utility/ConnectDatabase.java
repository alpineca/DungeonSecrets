package com.dungeonsecrets.backEnd.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {

    private static final String url        = "jdbc:mysql://remotemysql.com:3306/yWrPkFmrrx";
    private static final String username   = "yWrPkFmrrx";
    private static final String password   = "n070mBUsFt";
    private static final String driverName = "com.mysql.cj.jdbc.Driver";
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
