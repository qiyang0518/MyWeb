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
public class RegisterServlet extends HttpServlet
{
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
        //1.获取请求参数
        String username = req.getParameter("username");
        System.out.println("username = " + username);
        String password = req.getParameter("password");
        System.out.println("password = " + password);
        String email = req.getParameter("email");
        System.out.println("email = " + email);
        String code = req.getParameter("code");
        System.out.println("code = " + code);

        //2.检查验证码是否正确(固定验证码abcdef)
        if("abcdef".equalsIgnoreCase(code))
        {
            //正确
            //3.检查 用户名是否可用
            //可用    调用Service保存到数据库     跳转注册成功页面    register_success.html
            if(userService.existUsername(username))
            {
                System.out.println("用户名" + username + "已存在");
                req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
            }
            else
            {//不可用   跳回注册页面
                userService.regist(new User(null,username,password,email));
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req,resp);
            }

        }
        else
        {
            //验证码不正确    跳回注册页面
            System.out.println("验证码[" + code + "]错误");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
        }
    }
}
