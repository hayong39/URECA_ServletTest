package servletstudy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;
import java.net.URLEncoder;
import java.util.Date;

/*
* Cookie : 웹 브라우저에 접속 정보를 저장
* - 보안이 상대적으로 취약함
* - 웹사이트당 하나의 쿠키가 만들어진다.
* - 저장용량에 제한 : 4KB
*/


/*
* Session : 서버의 메모리에 접속 정보를 저장
* - 상대적으로 쿠키보다 보안이 좋다.
* - 서버에 부하가 올 수 있다.
* - 클라이언트 브라우저 당 하나의 세션이 생성된다.
* - 세션의 유효시간이 존재한다. (기본 30분)
*/

@WebServlet(value="/s10")
public class S10Cookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        Cookie c1 = new Cookie("cooke_test_1", "쿠키테스트1");
        c1.setMaxAge(60*60*24);
        resp.addCookie(c1);

        Cookie c2 = new Cookie("cooke_test_2", URLEncoder.encode("테스트 2번입니다.", "utf-8"));
        c1.setMaxAge(60*60*24);
        resp.addCookie(c2);


        Date date = new Date();
        out.print("현재 시간 : "+date);

        out.close();

    }
}
