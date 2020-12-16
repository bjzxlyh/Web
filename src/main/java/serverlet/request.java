package serverlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringReader;

@WebServlet("/request")
public class request extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod();
        System.out.println(method);
        String contextpath = req.getContextPath();
        System.out.println(contextpath);
        String Servletpath = req.getServletPath();
        System.out.println(Servletpath);
        String Query = req.getQueryString();
        System.out.println(Query);
        String uri = req.getRequestURI();
        System.out.println(uri);
        StringBuffer url = req.getRequestURL();
        System.out.println(url);
        String Protocol = req.getProtocol();
        System.out.println(Protocol);
        String RemoteAdder = req.getRemoteAddr();
        System.out.println(RemoteAdder);
    }
}
