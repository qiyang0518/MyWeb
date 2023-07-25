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
public class Servlet01 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Servlet01的doGet方法");

    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Servlet01的doPost方法");
    }
}
