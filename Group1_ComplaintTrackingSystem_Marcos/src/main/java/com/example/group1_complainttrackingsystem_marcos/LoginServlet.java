package com.example.group1_complainttrackingsystem_marcos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter log = response.getWriter();
        log.println("<html>");
        log.println("<head>");

        log.println("<title>GCTS</title>");

        log.println("<style>");
        log.println("body {");
        log.println("background: linear-gradient(to right, #9c27b0, #8ecdff);");
        log.println("overflow: hidden;");
        log.println("}");
        log.println("h1 {");
        log.println("text-align: center;");
        log.println("font-family: 'Iron Bridge';");
        log.println("font-size: 80px;");
        log.println("color: white;");
        log.println("width: 100%;");
        log.println("position: relative;");
        log.println("}");
        log.println(".inputs {");
        log.println("font-family: 'Microsoft YaHei UI';");
        log.println("text-align: center;");
        log.println("color: white;");
        log.println("}");
        log.println("#un {");
        log.println("margin-bottom: 3px;");
        log.println("width: 200px;");
        log.println("height: 20px;");
        log.println("margin-right: 95px;");
        log.println("}");
        log.println("#pd {");
        log.println("margin-bottom: 3px;");
        log.println("width: 200px;");
        log.println("height: 20px;");
        log.println("margin-right: 90px;");
        log.println("}");
        log.println("#logBtn {");
        log.println("font-family: 'Microsoft YaHei UI';");
        log.println("background-color: #4CAF50;");
        log.println("border: none;");
        log.println("color: white;");
        log.println("padding: 15px 32px;");
        log.println("text-decoration: none;");
        log.println("font-size: 16px;");
        log.println("margin-top: 10px;");
        log.println("}");
        log.println("</style>");

        log.println("</head>");

        log.println("<body>");
        log.println("<div class=\"logo\" style=\"text-align: center\">");
        log.println("<img src=\"brokengadget.png\" width=\"15%\" height=\"30%\">");
        log.println("</div>");
        log.println("<h1>");
        log.println("Login");
        log.println("</h1>");
        log.println("<form method=\"GET\" action=\"filecomplaint\">");
        log.println("<div class=\"inputs\">");
        log.println("<form method=\"GET\" action=\"login\">");
        log.println("Username: <input type=\"text\" name=\"uname\" id=\"un\">");
        log.println("<br/>");
        log.println("Password: <input type=\"password\" name=\"pwd\" id=\"pd\">");
        log.println("<br/>");
        log.println("<input type=\"submit\" name=\"login\" value=\"Login\" method=\"POST\" id=\"logBtn\">");
        log.println("<br/>");
        log.println("</div>");
        log.println("</form>");
        log.println("</body>");
        log.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("uname");
        String password = request.getParameter("pwd");
        if ("admin".equals(username) && password.equals("pwd")) {
            Cookie userCookie = new Cookie("userCookie", username);
            userCookie.setMaxAge(63072000);
            response.addCookie(userCookie);
            response.sendRedirect("filecomplaint");
        }
        else {
            response.sendRedirect("login");
        }
    }
}
