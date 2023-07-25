package main.com.dao.impl;
import main.com.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public abstract class BaseDao
{
    //使用DBUtils操作数据库
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * update()方法用来执行，insert、delete、update语句
     *
     * @return 如果返回-1,说明执行失败,返回其他说明影响行数
     */
    public int update(String sql,Object... args)
    {
        Connection connection = JdbcUtils.getConnection();
        try
        {
            //正常情况
            return queryRunner.update(connection,sql,args);
        } catch(SQLException throwables)
        {
            throwables.printStackTrace();
        }finally
        {
            JdbcUtils.close(connection);
        }
        //异常情况
        return -1;
    }

    /**
     * 查询返回一个JavaBean的sql语句
     * @param type  返回对象类型
     * @param sql   执行sql语句
     * @param args  sql对应参数值
     * @param <T>   返回类型的泛型
     * @return
     */
    public <T> T queryForOne(Class<T> type,String sql,Object... args)
    {
        Connection connection = JdbcUtils.getConnection();
        try
        {
            return queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
        } catch(SQLException throwables)
        {
            throwables.printStackTrace();
        }finally
        {
            JdbcUtils.close(connection);
        }
        return null;
    }

    /**
     * 查询返回多个JavaBean的sql语句
     * @param type  返回对象类型
     * @param sql   执行sql语句
     * @param args  sql对应参数值
     * @param <T>   返回类型的泛型
     * @return
     */
    public <T>List<T> queryForList(Class<T> type,String sql,Object... args)
    {
        Connection connection = JdbcUtils.getConnection();
        try
        {
            return queryRunner.query(connection,sql,new BeanListHandler<>(type),args);
        } catch(SQLException throwables)
        {
            throwables.printStackTrace();
        }finally
        {
            JdbcUtils.close(connection);
        }
        return null;
    }

    /**
     * 执行返回一行一列的sql语句
     * @param sql   执行的sql语句
     * @param args  sql对应的参数值
     * @return
     */
    public Object queryForSingleValue(String sql,Object... args)
    {
        Connection connection = JdbcUtils.getConnection();
        try
        {
            return queryRunner.query(connection,sql,new ScalarHandler(),args);
        } catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            JdbcUtils.close(connection);
        }
        return null;
    }
}

