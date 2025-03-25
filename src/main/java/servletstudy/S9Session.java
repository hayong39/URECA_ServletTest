package servletstudy;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value="/s9")
public class S9Session extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        System.out.println(session.getId());

        session.setAttribute("data_share_1", "HttpSession을 통해 data를 share");

        ArrayList<String> list = new ArrayList<>();
        list.add("apple"); list.add("banana"); list.add("cherry");
        session.setAttribute("data_share_2", list);

    }
}
