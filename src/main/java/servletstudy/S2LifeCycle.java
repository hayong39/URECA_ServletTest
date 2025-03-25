package servletstudy;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * servlet의 생명 주기 : servlet의 생성, 실행, 파괴 과정.
 * 생성자 -> init() -> service() -> destroy()
 * init() : service() 시작 전에 수행하는 메소드.
 * service() : 업무 처리 메소드. 전송 방식에 따라 doGet(), doPost()로 나뉜다.
 * destroy() : 서블릿이 생성 후, 일정시간 사용되지 않으면, 메모리 회수하면서, 마지막으로 실행되는 메소드.
 */
@WebServlet(value = "/s2")
public class S2LifeCycle extends HttpServlet {

	public S2LifeCycle() {
		System.out.println("1. 생성자 실행");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("2. init 실행");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("3. service 실행");
	}

	@Override
	public void destroy() {
		System.out.println("4. destroy 실행");
	}

} // class
