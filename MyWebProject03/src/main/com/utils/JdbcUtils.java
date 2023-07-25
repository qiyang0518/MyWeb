package main.com.utils;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class JdbcUtils
{
    private static DruidDataSource dataSource;

    static
    {
        try
        {
            Properties properties = new Properties();
            //读取jdbc.properties属性配置文件(通过反射)
//            InputStream resource = JdbcUtils.class.getClassLoader().getResourceAsStream("C:\\Users\\xml\\Desktop\\Test\\MyWeb\\MyWebProject03\\src\\main\\resource\\jdbc.properties");
            InputStream resource = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            //从流中加载数据
            properties.load(resource);
            //创建数据库连接池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    /**
     * 获取数据库连接池中的链接
     * 如果返回null,说明连接失败
     * 有返回值说明连接成功
     *
     * @return
     */
    public static Connection getConnection()
    {
        Connection connection = null;
        try
        {
            connection = dataSource.getConnection();
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 关闭连接,放回数据库连接池
     *
     * @param connection
     */
    public static void close(Connection connection)
    {
        if(connection != null)
        {
            try
            {
                connection.close();
            } catch(SQLException throwables)
            {
                throwables.printStackTrace();
            }
        }
    }

}
