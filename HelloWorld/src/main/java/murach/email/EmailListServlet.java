package murach.email;

import java.io.*;
import java.sql.Date;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import murach.business.Information;
import murach.business.User;

import javax.swing.*;


public class EmailListServlet extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.jsp";    // the "join" page
        }
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            //Date birth = Date.valueOf(request.getParameter("birth"));
            String birth = request.getParameter("birth");
            String hear = request.getParameter("hear");
            String announcements = request.getParameter("announcements");
            String contact = request.getParameter("contact");


            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email, birth);
            Information information = new Information(hear,announcements, contact);
            //UserDB.insert(user);

            // set User object in request object and set URL
            request.setAttribute("user", user);
            request.setAttribute("information", information);
            url = "/thanks.jsp";   // the "thanks" page
        }

        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}

