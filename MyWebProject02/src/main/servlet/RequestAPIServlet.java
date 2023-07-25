package main.servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class RequestAPIServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
        System.out.println(req.getRequestURI());
        //获取IP地址
        System.out.println(req.getRemoteHost());
        //请求头
        System.out.println(req.getHeader("User-Agent"));
    }
}
