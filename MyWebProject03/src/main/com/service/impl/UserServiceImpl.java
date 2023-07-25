package main.com.service.impl;
import main.com.dao.impl.UserDao;
import main.com.dao.impl.UserDaoImpl;
import main.com.pojo.User;
import main.com.service.UserService;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class UserServiceImpl implements UserService
{
    private UserDao userDao = new UserDaoImpl();
    @Override
    public void regist(User user)
    {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user)
    {
        return userDao.queryUserByUsernameAndPassWord(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existUsername(String username)
    {
        //等于null,说明没查到,可用
        if(userDao.queryUserByUsername(username) == null)
        {
            return false;
        }
        //查到,不可用
        return true;
    }
}
