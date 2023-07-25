package main.servlet;
import main.dao.FruitDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class AddServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
        //        super.doPost(req,resp);
        req.setCharacterEncoding("UTF-8");
        String fName = req.getParameter("fName");
        int price = Integer.parseInt(req.getParameter("price"));
        int fCount = Integer.parseInt(req.getParameter("fCount"));
        String remark = req.getParameter("remark");
        System.out.println("fName= " + fName);
        System.out.println("price= " + price);
        System.out.println("fCount= " + fCount);
        System.out.println("remark= " + remark);
        FruitDaoImpl fruitDao = new FruitDaoImpl();
        //        boolean flag = fruitDao.addFruit();
        //        System.out.println(flag ? "添加成功" : "添加失败");
    }

}

