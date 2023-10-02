package kz.javarush.kamenov.quest.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;


class QuestServletTest {
    private final static String questJSP = "WEB-INF/quest.jsp";

    @Test
    void doGet() throws ServletException, IOException {
        final  QuestServlet servlet= new QuestServlet();
        final HttpServletRequest request = mock(HttpServletRequest.class);
        final HttpServletResponse response = mock(HttpServletResponse.class);
        final HttpSession session = mock(HttpSession.class);
        final RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher(questJSP)).thenReturn(dispatcher);

        servlet.doGet(request,response);

        verify(request).getRequestDispatcher(questJSP);

    }
}