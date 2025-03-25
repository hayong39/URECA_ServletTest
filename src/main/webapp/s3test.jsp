<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="./header.jsp" %>
<%@ include file="./nav.jsp" %>

  <form action="./s3" method="post">
    별명을 입력해주세요 : <input type="text" class="form-control" name="nickname">

    <br><br>
    좋아하는 과일은?
    <label for="apple">apple</label>
    <input type="checkbox" id="apple" name="fruit" value="apple">
    <label for="banana">banana</label>
    <input type="checkbox" id="banana" name="fruit" value="banana">
    <label for="cherry">cherry</label>
    <input type="checkbox" id="cherry" name="fruit" value="cherry">
    <br><br>
    <button type="submit">서버로 전송</button>

  </form>


<%@ include file="./footer.jsp" %>

