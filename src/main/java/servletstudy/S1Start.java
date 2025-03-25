package servletstudy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/s1")
// 톰캣에 현재 프로그램을 등록 + RequestMapping의 역할.
// web.xml에 등록하는 행위로 대체할 수 있다.
public class S1Start extends HttpServlet {

	/*
	 * get : data를 주소에 포함시켜 보내는 방법
	 *     : 주소 창에 data가 보인다 -> 기본 암호화 없음 -> 보안 취약
	 *     : post 보다 비교적 빠르다
	 *     : w3c 공식 입장은 주소 외의 data는 256byte 까지만 유효하다 (실제로는 더 많이 보낼 수 있다)
	 */

	/*
	 * QueryString : get 방식에서 주소 창에 연결된 data를 의미한다.
	 * QueryString 제조 방식 1. 주소 뒤에 ?를 한 번만 붙인다.
	 * QueryString 제조 방식 2. name=value의 쌍으로 붙인다.
	 * QueryString 제조 방식 3. &를 붙인다.
	 * QueryString 제조 방식 4. data 갯수만큼 name=value&를 반복한다.
	 * 예) http://localhost:8080/s1?ename=modi&job=salesman&deptno=40
	 */

	/*
	 * post : 전달하려는 data를 숨겨서 보내는 방법
	 *      : 기본 암호화 -> 보안이 get 보다 비교적 좋다
	 *      : 암호화의 시간적 딜레이가 있다 -> get 보다 비교적 느리다
	 *      : get 보다 대량 data 전송에 유리하다
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("!!!!!!!!!! GET !!!!!!!!!!");

		// HttpServletRequest : 클라이언트의 정보를 담은 객체
		System.out.println( "getRemoteAddr : " + req.getRemoteAddr());
		System.out.println( "getRemoteHost : " + req.getRemoteHost());
		System.out.println( "getRemotePort : " + req.getRemotePort());

		String inData =  req.getParameter("ename") ;
		System.out.println( "inData : " + inData );

		// HttpServletResponse : 클라이언트에게 보낼 정보를 담을 객체
		PrintWriter out = resp.getWriter();
		out.print("<html><head><meta charset='UTF-8'><title>doGetTest</title></head><body>");
		out.print("<h1>GET TEST !!!</h1>");
		out.print("<h1>" + inData + "</h1></body></html>");
		out.close();

	} // doGet

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String inData = req.getParameter("job");
		System.out.println("!!!!!!!!!! POST !!!!!!!!!!");

		System.out.println( "inData : " + inData );

		PrintWriter out = resp.getWriter();
		out.print("<html><head><meta charset='UTF-8'><title>doPostTest</title></head><body>");
		out.print("<h1>POST TEST !!!</h1>");
		out.print("<h1>" + inData + "</h1></body></html>");
		out.close();
	} // doPost

} // class
