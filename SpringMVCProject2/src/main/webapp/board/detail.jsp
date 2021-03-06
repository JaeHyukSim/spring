<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.row {
   margin: 0px auto;
   width:600px;
}
h1 {
  text-align: center;
}
</style>
</head>
<body>
   <div class="container">
      <h1>내용보기</h1>
      <div class="row">
        <table class="table table-hover">
          <tr>
           <th width=20% class="text-center success">번호</th>
           <td width=30% class="text-center">${vo.getNo()}</td>
           <th width=20% class="text-center success">작성일</th>
           <td width=30% class="text-center">
             <fmt:formatDate value="${vo.getRegdate()}" pattern="yyyy-MM-dd"/></td>
          </tr>
          <tr>
           <th width=20% class="text-center success">이름</th>
           <td width=30% class="text-center">${vo.getName()}</td>
           <th width=20% class="text-center success">조회수</th>
           <td width=30% class="text-center">${vo.getHit()}</td>
          </tr>
          <tr>
           <th width=20% class="text-center success">제목</th>
           <td colspan="3" class="text-left">${vo.getSubject()}</td>
          </tr>
          <tr>
            <td colspan="4" class="text-left" valign="top" height="200">
             <pre style="white-space: pre-wrap;background-color: white;border: none ">${vo.getContent()}</pre>
            </td>
          </tr>
          <tr>
            <td colspan="4" class="text-right">
              <a href="update.do?no=${vo.no }" class="btn btn-xs btn-danger">수정</a>
              <a href="delete.do?no=${vo.no }" class="btn btn-xs btn-info">삭제</a>
              <a href="list.do" class="btn btn-xs btn-success">목록</a>
            </td>
          </tr>
        </table>
      </div>
    </div>
</body>
</html>