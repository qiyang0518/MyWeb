package main.com.test;
import main.com.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class JdbcUtilsTest
{
    @Test
    public void testJdbcUtils()
    {
        for(int i = 0;i < 100;i++)
        {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            //释放链接
            JdbcUtils.close(connection);
        }
    }
}
