package servletstudy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/s62")
public class S6Include2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("ename"));
        System.out.println(req.getAttribute("data_tran_1"));
        PrintWriter out = resp.getWriter();
        out.print("<html><head><title>include test</title></head><body>");
    }
}
