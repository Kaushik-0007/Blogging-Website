/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.helper;
import java.sql.*;
/**
 *
 * @author family
 */
public class ConnectionProvider {
    
    private static Connection con;
    public static Connection getConnection(){
        try {
            if(con==null) {
                Class.forName("com.mysql.jdbc.Driver");
            
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Blog","root","kaushik2003");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
    
}
