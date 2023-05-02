package com.xiehn;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/display")
public class ShowServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int sid = Integer.parseInt(request.getParameter("sid"));
        String sname=request.getParameter("sname");
        String sex=request.getParameter("sex");
        String clazz=request.getParameter("clazz");

        Student student=new Student(sid,sname,sex,clazz);

        request.setAttribute("student",student);

        request.getRequestDispatcher("/displayStudent.jsp").forward(request,response);

    }
}
