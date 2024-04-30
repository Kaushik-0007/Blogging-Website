/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.dao;
import com.blog.entities.User;
import java.sql.*;


/**
 *
 * @author family
 */

public class UserDao {

    private interface UserDaoInterface {
        boolean saveUser(User user);
        User getUserByEmailAndPassword(String email, String password);
        boolean updateUser(User user);
        User getUserByUserId(int userId);
    }

    private static class UserDaoImpl implements UserDaoInterface {

        private Connection con;

        public UserDaoImpl(Connection con) {
            this.con = con;
        }

        @Override
        public boolean saveUser(User user) {
            boolean f = false;
            try {
                String query = "insert into user(name,email,password,gender,about) values (?,?,?,?,?)";
                PreparedStatement pstmt = this.con.prepareStatement(query);
                pstmt.setString(1, user.getName());
                pstmt.setString(2, user.getEmail());
                pstmt.setString(3, user.getPassword());
                pstmt.setString(4, user.getGender());
                pstmt.setString(5, user.getAbout());
                pstmt.executeUpdate();
                f = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return f;
        }

        @Override
        public User getUserByEmailAndPassword(String email, String password) {
            User user = null;
            try {
                String query = "select * from user where email =? and password=?";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, email);
                pstmt.setString(2, password);
                ResultSet set = pstmt.executeQuery();
                if (set.next()) {
                    user = new User();
                    user.setName(set.getString("name"));
                    user.setId(set.getInt("id"));
                    user.setEmail(set.getString("email"));
                    user.setPassword(set.getString("password"));
                    user.setGender(set.getString("gender"));
                    user.setAbout(set.getString("about"));
                    user.setDateTime(set.getTimestamp("rdate"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return user;
        }

        @Override
        public boolean updateUser(User user) {
            boolean f = false;
            try {
                String query = "update user set name=? , email=? , password=? , gender=? ,about=? , profile=? where  id =?";
                PreparedStatement p = con.prepareStatement(query);
                p.setString(1, user.getName());
                p.setString(2, user.getEmail());
                p.setString(3, user.getPassword());
                p.setString(4, user.getGender());
                p.setString(5, user.getAbout());
                p.setString(6, user.getProfile());
                p.setInt(7, user.getId());
                p.executeUpdate();
                f = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return f;
        }

        @Override
        public User getUserByUserId(int userId) {
            User user = null;
            try {
                String q = "select * from user where id=?";
                PreparedStatement ps = this.con.prepareStatement(q);
                ps.setInt(1, userId);
                ResultSet set = ps.executeQuery();
                if (set.next()) {
                    user = new User();
                    user.setName(set.getString("name"));
                    user.setId(set.getInt("id"));
                    user.setEmail(set.getString("email"));
                    user.setPassword(set.getString("password"));
                    user.setGender(set.getString("gender"));
                    user.setAbout(set.getString("about"));
                    user.setDateTime(set.getTimestamp("rdate"));
                    user.setProfile(set.getString("profile"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return user;
        }
    }

    private UserDaoInterface userDao;

    public UserDao(Connection con) {
        this.userDao = new UserDaoImpl(con);
    }

    public boolean saveUser(User user) {
        return userDao.saveUser(user);
    }

    public User getUserByEmailAndPassword(String email, String password) {
        return userDao.getUserByEmailAndPassword(email, password);
    }

    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }

    public User getUserByUserId(int userId) {
        return userDao.getUserByUserId(userId);
    }
}
    