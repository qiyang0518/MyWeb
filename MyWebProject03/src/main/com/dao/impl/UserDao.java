package main.com.dao.impl;
import main.com.pojo.User;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public interface UserDao
{

    /**
     * 根据用户名查询用户信息
     * @param username  用户名
     * @return  如果返回null,说明未查到,反之,查到
     */
    public User queryUserByUsername(String username);

    /**
     * 根据用户名密码查询用户信息
     * @param username  用户名
     * @param password  密码
     * @return  如果返回null,说明用户名错误或密码,反之,查到
     */
    public User queryUserByUsernameAndPassWord(String username,String password);

    /**
     * 保存用户信息
     * @param user
     * @return  返回-1表示操作失败,其他即sql语句影响的行数
     */
    public int saveUser(User user);
}
