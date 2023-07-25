package main.com.service;
import main.com.pojo.User;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public interface UserService
{
    /**
     * 注册用户
     * @param user
     */
    public void regist(User user);

    /**
     * 登录用户
     * @param user
     * @return 返回null,登陆失败,反之登录成功
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     * @param name
     * @return  返回true用户名,已存在;反之,则可使用
     */
    public boolean existUsername(String name);
}
