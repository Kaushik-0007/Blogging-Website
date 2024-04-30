/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.entities;

import java.sql.*;

public class PostFactory {
    
    public static Post createPost(int pid, String pTitle, String pContent, String pCode, String pPic, Timestamp pDate, int catId, int userId) {
        return new Post(pid, pTitle, pContent, pCode, pPic, pDate, catId, userId);
    }
}
