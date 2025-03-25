package servletstudy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/s5")
public class S5Redirct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.sendRedirect("https://naver.com/");
        //resp.addHeader("Refresh", "10;url=https://www.naver.com/");
        PrintWriter out = resp.getWriter();
        out.print("<body><script>");
        out.print("location.href='https://www.naver.com/'");
        out.print("</script></body>");
        out.close();


        System.out.println("S5Redirect - doGet- after sendRedirect");
    }
}
