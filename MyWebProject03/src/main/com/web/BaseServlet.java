package main.com.web;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public abstract class BaseServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
        String action = req.getParameter("action");
        //        if("login".equals(action))
        //        {
        //            login(req,resp);
        //        }
        //        else if("regist".equals(action))
        //        {
        //            regist(req,resp);
        //        }
        try
        {
            //获取action业务鉴别字符串,获取相应的业务方法反射对象
            Method method = this.getClass().getDeclaredMethod(action,HttpServletRequest.class,HttpServletResponse.class);
            //调用目标业务方法
            method.invoke(this,req,resp);
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
