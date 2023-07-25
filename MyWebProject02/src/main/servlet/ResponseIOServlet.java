package main.servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ResponseIOServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
        /*
        //设置服务器编码
        resp.setCharacterEncoding("UTF-8");
        //通过响应头,设置浏览器使用UTF-8
        resp.setHeader("Content-Type","text/html;charset=UTF-8");
        //        resp.getWriter();
         */
        resp.setContentType("text/html;charset-UTF-8");
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.print("国潮最牛!");
    }
}


