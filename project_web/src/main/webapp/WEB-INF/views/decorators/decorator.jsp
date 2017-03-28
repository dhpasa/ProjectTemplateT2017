<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <%@ include file="../common/commoncssHead.jsp"%>
  <title>
  <sitemesh:write property='title' />
  </title>
  <sitemesh:write property='head' />
  
</head>
<!-- Head END -->
<script>
	
</script>

<!-- Body BEGIN -->
<body>
<!-- BEGIN HEADER -->
<div class="">
	
</div>
<!-- END HEADER -->

<!-- LEFT MENU START -->
<div >
	<!-- 页面内容 START -->
	<sitemesh:write property='body' />
	<!-- 页面内容 END -->
</div>
<!-- LEFT MENU END -->
	<%@ include file="../common/commonjsFooter.jsp"%>
</body>
<!-- END BODY -->
</html>