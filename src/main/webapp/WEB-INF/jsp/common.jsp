<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'success.jsp' starting page</title>


</head>

<body>
每个人都可以访问的页面
<a href = "<%=basePath %>test/admin">管理员界面</a>
<a href = "<%=basePath %>auth/login">退出登录</a>
</body>
</html>
