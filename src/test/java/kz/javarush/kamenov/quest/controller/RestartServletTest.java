package kz.javarush.kamenov.quest.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RestartServletTest {

    @Test
    void doGet() throws ServletException, IOException {
        final  RestartServlet servlet= new RestartServlet();
        final HttpServletRequest request = mock(HttpServletRequest.class);
        final HttpServletResponse response = mock(HttpServletResponse.class);
        final HttpSession session = mock(HttpSession.class);


        when(request.getSession()).thenReturn(session);

        servlet.doGet(request,response);

        verify(request).getSession();
        verify(response).sendRedirect("/");
    }
}