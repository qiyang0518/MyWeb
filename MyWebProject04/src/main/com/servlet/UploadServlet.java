package main.com.servlet;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class UploadServlet extends HttpServlet
{
    /**
     * 处理文件上传
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
        //        System.out.println("文件上传...");
        //        System.out.println(req.getParameter("username"));
        //        System.out.println(req.getParameter("photo"));
        //        byte[] buffer = new byte[102400];
        //        ServletInputStream inputStream = req.getInputStream();
        //        int read = inputStream.read(buffer);
        //        System.out.println(new String(buffer,0,read));
        req.setCharacterEncoding("UTF-8");
        //1.判断上传的数据是否为多段数据(只有是多段数据,才是文件上传的)
        if(ServletFileUpload.isMultipartContent(req))
        {
            //创建FileItemFactory工厂实现类
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            //创建用于解析上传数据的工具类ServletFileUpload类
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            try
            {
                //解析上传的数据,得到表单项FileItem
                List<FileItem> list = servletFileUpload.parseRequest(req);
                for(FileItem fileItem : list)
                {
                    if(fileItem.isFormField())
                    {
                        //true,普通表单项
                        System.out.println("表单项的name属性值:" + fileItem.getName());
                        //UTF-8解决乱码问题
                        System.out.println("表单项的value属性值:" + fileItem.getString("UTF-8"));
                    }
                    else
                    {
                        //false,上传表单项
                        System.out.println("表单项的name属性值:" + fileItem.getName());
                        System.out.println("上传的文件名:" + fileItem.getName());
                        fileItem.write(new File("D:\\" + fileItem.getName()));

                    }
                }

            } catch(Exception e)
            {
                e.printStackTrace();
            }

        }
    }
}
