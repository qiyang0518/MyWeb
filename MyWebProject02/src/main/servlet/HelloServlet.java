package main.servlet;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HelloServlet implements Servlet
{
    public HelloServlet()
    {
        System.out.println("执行构造方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException
    {
        System.out.println("init...");
    }

    @Override
    public ServletConfig getServletConfig()
    {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest,ServletResponse servletResponse) throws ServletException, IOException
    {
        System.out.println("service...");
    }

    @Override
    public String getServletInfo()
    {
        return null;
    }

    @Override
    public void destroy()
    {
        System.out.println("destroy...");
    }
}
