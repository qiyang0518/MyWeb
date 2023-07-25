package main.com.web;
import main.com.pojo.User;
import main.com.service.UserService;
import main.com.service.impl.UserServiceImpl;

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
public class LoginServlet extends HttpServlet
{

    private UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
        //        1.获取请求参数
        String username = req.getParameter("username");
        System.out.println("username" + username);
        String password = req.getParameter("password");
        System.out.println("password" + password);
        //调用userService.login()登录处理业务
        User login = userService.login(new User(null,username,password,null));
        if(login == null)
        {
            //把错误的信息和回显的表单项信息,保存到Request域中
            req.setAttribute("msg","用户或密码错误!");
            req.setAttribute("username",username);
            req.getRequestDispatcher("/pages/user/login.html").forward(req,resp);
        }
        else
        {
            req.getRequestDispatcher("/pages/user/login_success.html").forward(req,resp);
        }
        //        2.
    }


}
