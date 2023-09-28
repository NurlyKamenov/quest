package kz.javarush.kamenov.quest.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kz.javarush.kamenov.quest.entity.Question;
import kz.javarush.kamenov.quest.service.GameService;

import java.io.IOException;


@WebServlet(name = "questServlet", value = "/start")
public class QuestServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession currentSession = request.getSession();
        String remoteAddr = request.getRemoteAddr();
        currentSession.setAttribute("remoteAddr", remoteAddr);
        if (currentSession.getAttribute("username") == null) {
            currentSession.setAttribute("username", request.getParameter("username"));
        }
        if (currentSession.getAttribute("gamesCount") == null) {
            currentSession.setAttribute("gamesCount", 0);
        }

        Long id = (request.getParameter("question") != null) ? Long.parseLong(request.getParameter("question")) : 1L;
        GameService gameService = GameService.getInstance();


        if (request.getParameter("end") != null) {
            if (Boolean.parseBoolean(request.getParameter("correct"))) {
                request.setAttribute("victory", true);
            } else request.setAttribute("victory", false);
            int gamesCount = Integer.parseInt(String.valueOf(currentSession.getAttribute("gamesCount")));
            currentSession.setAttribute("gamesCount", ++gamesCount);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/end.jsp");
            requestDispatcher.forward(request, response);
        }

        Question question = gameService.getQuestionById(id);
        request.setAttribute("question", question);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/quest.jsp");
        requestDispatcher.forward(request, response);

    }
}