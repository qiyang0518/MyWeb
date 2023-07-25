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
public class Response1 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
        System.out.println("Response1...");
        //设置响应状态码302,表示重定向
        resp.setStatus(302);
        //设置响应头,说明新的地址在哪里
        resp.setHeader("Location","http://localhost:8088/MyWebProject02/response2");

    }
}
