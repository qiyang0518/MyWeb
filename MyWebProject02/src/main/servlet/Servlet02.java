package main.servlet;
/*
  @author 齐阳
 * @version 1.0
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@SuppressWarnings({"all"})
public class Servlet02 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Servlet02的doGet");
        String username = request.getParameter("username");
        System.out.println(username);
        request.setAttribute("key","柜台一的章");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet03");
        requestDispatcher.forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Servlet02的doPost");
    }
}
