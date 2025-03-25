package servletstudy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/s72")
public class S7Forward2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("S7Forward2 - doGet - START");

        PrintWriter out = resp.getWriter();
        out.print("<body bgcolor=pink>");
        out.print("<h1>forward test success s72!!</h1>");
        out.print("</body>");

        System.out.println("S7Forward2 - doGet - END");

    }
}
