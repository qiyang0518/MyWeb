package main.demo;
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
//演示生命周期
public class DemoServlet extends HttpServlet
{
    @Override
    public void init() throws ServletException
    {
        System.out.println("正在初始化...");
    }

    @Override
    protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
        String method = req.getMethod();
        System.out.println(method);
        System.out.println("正在服务...");
    }

    @Override
    public void destroy()
    {
        System.out.println("正在销毁...");
    }
}
