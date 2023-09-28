<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Quest</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="col-md-auto">
        <h1> ${sessionScope.username} ${requestScope.question.getText()}</h1>
        <br>
        <br>
        <c:forEach items="${requestScope.question.getAnswers()}" var="answer">
            <c:choose>

                <c:when test="${empty answer.getNextQuestion().getId()}">
                    <a href="/start?end=true&correct=${answer.getCorrectAnswer()}" type="button"
                       class="btn btn-primary">${answer.getText()}</a>
                </c:when>
                <c:otherwise>
                    <a href="/start?question=${answer.getNextQuestion().getId()}" type="button"
                       class="btn btn-primary">${answer.getText()}</a>
                </c:otherwise>
            </c:choose>
        </c:forEach>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
                crossorigin="anonymous"></script>
    </div>
</div>
</body>
</html>
