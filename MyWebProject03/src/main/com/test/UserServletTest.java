package main.com.test;
import main.com.web.UserServlet;

import java.lang.reflect.Method;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class UserServletTest
{
    public void login()
    {
        System.out.println("这是login方法");
    }

    public void regist()
    {
        System.out.println("这是regist方法");
    }

    public void updataUser()
    {
        System.out.println("这是upadteUser方法");
    }

    public void updateUserPassword()
    {
        System.out.println("这是upadteUserPassword方法");
    }

    public static void main(String[] args)
    {
        String action = "login";

        try
        {
            Method method = UserServlet.class.getDeclaredMethod(action);
            System.out.println(method);
            method.invoke(new UserServletTest());
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
