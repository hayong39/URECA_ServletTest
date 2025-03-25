package servletstudy;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/s6")
public class S6Include extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("S6Include - doGet - START");

        req.setAttribute("data_tran_1", "s6에서 전달하는 데이터입니다. ");

        //RequestDispatcher: Request를 Dispatcher하다. client의 request를 분기한다.
        RequestDispatcher rd = req.getRequestDispatcher("/s62"); //분기할 곳 지정
        rd.include(req, resp); //다른 파일을 복사해오는 개념

        PrintWriter out = resp.getWriter();
        out.print("<h1>include test success!</h1>");
        out.print("</body></html>");
        out.close();
        System.out.println("S6Include - doGet - END");
    }
}
