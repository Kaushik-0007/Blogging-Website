/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.blog.servlets;

import com.blog.entities.Message;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

interface Command {
    void execute(HttpServletRequest request, HttpServletResponse response);
}

class LogoutCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        session.removeAttribute("currentUser");

        Message message = new Message("Logout Successfully", "success", "alert-success");
        session.setAttribute("msg", message);

        try {
            response.sendRedirect("login_page.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class LogoutServlet extends HttpServlet {
    private final Command logoutCommand = new LogoutCommand();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logoutCommand.execute(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logoutCommand.execute(request, response);
    }
}

