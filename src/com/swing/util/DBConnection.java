package com.swing.util;

import java.sql.*;

public class DBConnection {
    Connection con;
    String url = "jdbc:mysql://localhost:3306/schema";
    String username = "root";
    String password = "root";
    String sql = "SELECT * FROM employee where id = '"+3+"'"; 
    void getData(){
        try {
            con = DriverManager.getConnection(url, username, password); //connection
            Statement st = con.createStatement(); //statement
            ResultSet rs = st.executeQuery(sql); //resultset
            while (rs.next()) {                
                System.out.println(rs.getString("name") + " " + rs.getInt("age"));
            }
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        DBConnection db = new DBConnection();
        db.getData();
    }
}