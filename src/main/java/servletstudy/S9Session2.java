package servletstudy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value="/s92")
public class S9Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        System.out.println(session.getAttribute("data_share_1"));
        System.out.println(session.getAttribute("data_share_2"));

        System.out.println(session.getId());
        System.out.println(session.getMaxInactiveInterval());
        System.out.println(session.getCreationTime());
        System.out.println(session.getLastAccessedTime());
        session.setMaxInactiveInterval(60*60*24);
        System.out.println(session.getMaxInactiveInterval());

        session.removeAttribute("data_share_1");
        System.out.println(session.getAttribute("data_share_1"));



    }
}
