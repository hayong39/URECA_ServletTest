package servletstudy;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/s7")
public class S7Forward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("S7Forward - doGet - START");
//
//        RequestDispatcher rd = req.getRequestDispatcher("/s72");
//        rd.forward(req, resp);

        PrintWriter out = resp.getWriter();
        out.print("<body bgcolor=red>");
        out.print("<h1>forward test success!</h1>");
        out.print("</body></html>");
        out.close();

        System.out.println("S7Forward - doGet - END");

    }
}
