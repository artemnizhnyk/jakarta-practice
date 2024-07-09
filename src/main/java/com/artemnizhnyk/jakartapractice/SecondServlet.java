package com.artemnizhnyk.jakartapractice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String parameter1 = req.getParameter("param1");
        String parameter2 = req.getParameter("param2");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + parameter1 + " + " + parameter2 + "</h1>");
    }
}
