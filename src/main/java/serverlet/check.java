package serverlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@WebServlet("/check")
public class check extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

           int width = 100;
           int height = 50;
        //1.创建一个对象，在内存中画图（验证码图片对象）
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //2.美化图片
//        //填充背景色
//        Graphics g = image.getGraphics();//画笔对象
//        g.setColor(Color.BLUE);//设置画笔颜色
//        g.fillRect(0,0,width,height);
//        //画边框
//        g.setColor(Color.BLACK);
//        g.drawRect(0,0,width-1,height-1);
//        //写验证码
//        g.drawString("A",20,25);
//        g.drawString("c",40,25);
//        g.drawString("2",60,25);
//        g.drawString("q",80,25);

        //3.将图片输出到页面展示
        //ImageIO.write(image,"jpg",response.getOutputStream());
    }
}
