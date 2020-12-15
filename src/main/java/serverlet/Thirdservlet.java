package serverlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/serv03")
public class Thirdservlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String uname = req.getParameter("uname");
        System.out.println(uname);


        /**
         * 请求转发跳转到index.html
         * 服务端的跳转，URL地址不发生改变，及从始至终只有一个请求，request可以共享
         */
        //req.getRequestDispatcher("index.html").forward(req,resp);
         req.getRequestDispatcher("Ser01").forward(req,resp);

    }
}
