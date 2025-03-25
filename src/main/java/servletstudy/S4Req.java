package servletstudy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/s4")
public class S4Req extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + req.getProtocol() + "</h1>");
        out.println("<h1>" + req.getMethod() + "</h1>");
        out.println("<h1>===========================================</h1>");
        out.println("<h1>" + req.getServerName() + "</h1>");
        out.println("<h1>" + req.getServerPort() + "</h1>");
        out.println("<h1>===========================================</h1>");
        out.println("<h1>" + req.getRequestURL() + "</h1>");
        out.println("<h1>" + req.getRequestURI() + "</h1>");
        out.println("<h1>===========================================</h1>");
        out.println("<h1>" + req.getServletPath() + "</h1>");
        out.println("<h1>" + req.getQueryString() + "</h1>");
        out.println("<h1>===========================================</h1>");
        out.println("<h1>" + req.getRemoteAddr() + "</h1>");
        out.println("<h1>" + req.getRemoteHost() + "</h1>");
        out.println("<h1>" + req.getRemotePort() + "</h1>");

        out.close();
    }
}
