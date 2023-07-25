package main.com.servlet;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class DownloadServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
        //1.获取要下载的文件名
        String downloadFileName = "头像.png";
        //2.获取文件内容(通过ServletContext对象进行读取)
        ServletContext servletContext = getServletContext();
        String mimeType = servletContext.getMimeType("/file/" + downloadFileName);
        System.out.println("下载的文件类型" + mimeType);
        //获取要下载的文件类型
        //4.在回传前通过响应头告诉客户端返回的数据类型
        resp.setContentType(mimeType);
        //5.并且告诉客户端收到的数据适用于下载使用(使用响应头)
        //Context-Disposition:表示收到的数据如何处理
        resp.setHeader("Context-Disposition","attament;filename = " + downloadFileName);
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + downloadFileName);
        OutputStream outputStream = resp.getOutputStream();
        //3.把下载的文件内容回传给客户端
        //读取输入流中全部数据,赋值给输出流,输出给客户端
        IOUtils.copy(resourceAsStream,outputStream);
    }
}
