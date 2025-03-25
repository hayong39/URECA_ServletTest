<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="/">HOME</a>

  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="#">Link 1</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link 2</a>
    </li>

    <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="/" id="navbardrop" data-toggle="dropdown">
        Servlet Home
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="/servlet_250325_war_exploded/s1test.jsp">S1Start</a>
        <a class="dropdown-item" href="/servlet_250325_war_exploded/s2">S2LifeCycle (화면 X)</a>
        <a class="dropdown-item" href="/servlet_250325_war_exploded/s3test.jsp">S3Param (화면 X)</a>
        <a class="dropdown-item" href="/servlet_250325_war_exploded/s4?ename=SMITH&job=SALESMAN&deptno=40">S4Req</a>
        <a class="dropdown-item" href="/servlet_250325_war_exploded/s5">S5Redirect (화면 X)</a>
        <a class="dropdown-item" href="/servlet_250325_war_exploded/s6test.jsp">S6Include</a>
        <a class="dropdown-item" href="/servlet_250325_war_exploded/s7test.jsp">S7Forward</a>
      </div>
    </li>
  </ul>
</nav>