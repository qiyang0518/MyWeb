package main.com.dao.impl;
import main.com.pojo.User;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class UserDaoImpl extends BaseDao implements UserDao
{
    @Override
    public User queryUserByUsername(String username)
    {
        String sql = "select id,username,password,email from userInfo where username = ?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassWord(String username,String password)
    {
        String sql = "select id,username,password,email from userInfo where username = ? and password = ?";
        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user)
    {
        String sql = "insert into userInfo(username,password,email) values(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }
}
