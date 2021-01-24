package serverlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletContextDemo1")
public class ServletContextDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         /*
         ServletContext对象获取：
           1.通过request对象获取
           2.通过HttpServletContext获取
          */
        //通过request对象获取
        //ServletContext context1 = request.getServletContext();


        //通过HttpServletContext获取
        ServletContext context2 = this.getServletContext();
       //定义文件名称
        String filename = "a.jpg";
        //获取MIME类型
        String mimeType = context2.getMimeType(filename);
        System.out.println(mimeType);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doPost(request,response);
    }
}
