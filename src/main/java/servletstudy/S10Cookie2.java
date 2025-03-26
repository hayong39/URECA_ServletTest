package servletstudy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

@WebServlet(value="/s102")
public class S10Cookie2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        Cookie[] cookieArr = req.getCookies();
        for(Cookie cookie:cookieArr){
            out.println("<h1>" + cookie.getName()+":"+ URLDecoder.decode(cookie.getValue(), "utf-8") + "(" + cookie.getMaxAge() + ") </h1>");
        }

        out.close();
    }
}
