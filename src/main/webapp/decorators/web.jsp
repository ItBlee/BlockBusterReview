<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 8/25/2022
  Time: 5:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- Basic need -->
    <title><dec:title default="Home" /></title>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="author" content="">
    <link rel="profile" href="#">

    <!--Google Font-->
    <link rel="stylesheet" href='http://fonts.googleapis.com/css?family=Dosis:400,700,500|Nunito:300,400,600' />
    <!-- Mobile specific meta -->
    <meta name=viewport content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone-no">

    <!-- CSS files -->
    <link rel="stylesheet" href="<c:url value='/template/web/css/plugins.css' />">
    <link rel="stylesheet" href="<c:url value='/template/web/css/style.css' />">

    
</head>
<body>
    <!-- header -->
    <%@ include file="web/header.jsp" %>
    <!-- header -->

    <dec:body/>

    <!-- footer -->
    <%@ include file="web/footer.jsp" %>
    <!-- footer -->
    
    <!-- script -->
    <script src="<c:url value='/template/web/js/jquery.js' />"></script>
    <script src="<c:url value='/template/web/js/plugins.js' />"></script>
    <script src="<c:url value='/template/web/js/plugins2.js' />"></script>
    <script src="<c:url value='/template/web/js/custom.js' />"></script>
    
</body>
</html>