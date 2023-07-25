package main.com.test;
import main.com.pojo.User;
import main.com.service.UserService;
import main.com.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
class UserServiceTest
{
    UserService userService = new UserServiceImpl();
    @Test
    public void regist()
    {
        userService.regist(new User(null,"qiyang","1234","qiyang@qq.com"));
    }

    @Test
    void login()
    {
        System.out.println(userService.login(new User(null,"qiyang","1234",null)));
    }

    @Test
    void existUsername()
    {
        if(userService.existUsername("张三"))
        {
            System.out.println("用户名已存在");
        }
        else
        {
            System.out.println("用户名可用");
        }
    }
}