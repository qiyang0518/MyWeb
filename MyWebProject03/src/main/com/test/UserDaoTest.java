package main.com.test;
import main.com.dao.impl.UserDao;
import main.com.dao.impl.UserDaoImpl;
import main.com.pojo.User;
import org.junit.jupiter.api.Test;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
class UserDaoTest
{
    UserDao userDao = new UserDaoImpl();

    @Test
    void queryUserByUsername()
    {

        if(userDao.queryUserByUsername("admin") == null)
        {
            System.out.println("用户名可用!");
        }
        else
        {
            System.out.println("用户名已存在!");
        }
    }

    @Test
    void queryUserByUsernameAndPassWord()
    {
        if(userDao.queryUserByUsernameAndPassWord("admin","admin") == null)
        {
            System.out.println("用户名或密码错误,查询失败!");
        }
        else
        {
            System.out.println("查询成功!");
        }
    }

    @Test
    void saveUser()
    {
        System.out.println(userDao.saveUser(new User(null,"mary","1234","mary@qq.com")));
    }
}