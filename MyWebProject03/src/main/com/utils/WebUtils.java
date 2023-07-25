package main.com.utils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class WebUtils
{
    public static void copyParamToBean(HttpServletRequest req,Object bean)
    {
        try
        {
            System.out.println("注入之前" + bean);
            BeanUtils.populate(bean,req.getParameterMap());
            System.out.println("注入之后" + bean);
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
