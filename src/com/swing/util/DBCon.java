package com.swing.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {
    public static Connection getConnection(){
            Connection con = null;
            String url = "jdbc:mysql://localhost:3306/schema";
            String username = "root";
            String password = "root";
            try {
                con = DriverManager.getConnection(url, username, password); //connection
            } catch (Exception e) {
            }
            return con;
    }
}