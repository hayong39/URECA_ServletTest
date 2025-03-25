package servletstudy;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;

public class S3Param extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("nickname")); //화면의 html element의 name 속성을 사용한다.

        String [] fruitArr = req.getParameterValues("fruit");
        System.out.println(Arrays.toString(fruitArr));

        // 받는 parameter name이 뭔지 모를 때
        Enumeration<String> enu = req.getParameterNames();
        while(enu.hasMoreElements()){
            String name = (String)enu.nextElement();
            System.out.println(req.getParameter(name));
        }

        //위는 fruit이 배열로 나오지 않는 문제가 있기에 map 사용
        Map<String, String[]> map = req.getParameterMap();
        Set<String> set = map.keySet(); //map에서 name들을 가져온다.
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String name = (String)iter.next();
            System.out.println(Arrays.toString(map.get(name)));
        }

    }
}
