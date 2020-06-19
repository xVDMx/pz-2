package practice.post.practice2.servlets;

import practice.post.practice2.UserCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class EnterServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        if (session != null) {
            req.setAttribute("user", session.getAttribute("user"));
            RequestDispatcher dispatcher = req.getRequestDispatcher("views/Cabinet.jsp"); 
            dispatcher.forward(req, resp);
        } else {

            RequestDispatcher dispatcher = req.getRequestDispatcher("views/Cabinet.jsp"); 
            dispatcher.forward(req, resp);
        }
    }
}
