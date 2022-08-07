package com.example.group1_complainttrackingsystem_marcos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreateAccServlet", value = "/create")
public class CreateAccServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter ca = response.getWriter();
        ca.println("<html>");
        ca.println("<head>");

        ca.println("<title>GCTS</title>");

        ca.println("<style>");
        ca.println("body {");
        ca.println("background: linear-gradient(to right, #9c27b0, #8ecdff);");
        ca.println("overflow: hidden;");
        ca.println("}");
        ca.println("h1 {");
        ca.println("text-align: center;");
        ca.println("font-family: 'Iron Bridge';");
        ca.println("font-size: 80px;");
        ca.println("color: white;");
        ca.println("width: 100%;");
        ca.println("position: relative;");
        ca.println("}");
        ca.println(".inputs {");
        ca.println("font-family: 'Microsoft YaHei UI';");
        ca.println("text-align: center;");
        ca.println("color: white;");
        ca.println("}");
        ca.println("#lblemail {");
        ca.println("margin-left: 29px;");
        ca.println("}");
        ca.println("#em {");
        ca.println("margin-bottom: 3px;");
        ca.println("width: 200px;");
        ca.println("height: 20px;");
        ca.println("margin-right: 90px;");
        ca.println("}");
        ca.println("#ln {");
        ca.println("margin-bottom: 3px;");
        ca.println("width: 200px;");
        ca.println("height: 20px;");
        ca.println("margin-right: 102px;");
        ca.println("}");
        ca.println("#fn {");
        ca.println("margin-bottom: 3px;");
        ca.println("width: 200px;");
        ca.println("height: 20px;");
        ca.println("margin-right: 104px;");
        ca.println("}");
        ca.println("#un {");
        ca.println("margin-bottom: 3px;");
        ca.println("width: 200px;");
        ca.println("height: 20px;");
        ca.println("margin-right: 96px;");
        ca.println("}");
        ca.println("#pd {");
        ca.println("margin-bottom: 3px;");
        ca.println("width: 200px;");
        ca.println("height: 20px;");
        ca.println("margin-right: 90px;");
        ca.println("}");
        ca.println("#createBtn {");
        ca.println("font-family: 'Microsoft YaHei UI';");
        ca.println("background-color: cornflowerblue;");
        ca.println("border: none;");
        ca.println("color: white;");
        ca.println("padding: 15px 32px;");
        ca.println("text-decoration: none;");
        ca.println("font-size: 16px;");
        ca.println("margin-top: 10px;");
        ca.println("}");
        ca.println("</style>");

        ca.println("</head>");

        ca.println("<body>");
        ca.println("<div class=\"logo\" style=\"text-align: center\">");
        ca.println("<img src=\"brokengadget.png\" width=\"15%\" height=\"30%\">");
        ca.println("</div>");
        ca.println("<h1>");
        ca.println("Create Account");
        ca.println("</h1>");
        ca.println("<form method=\"GET\" action=\"login\">");
        ca.println("<div class=\"inputs\">");
        ca.println("<label id=\"lblemail\">Email:</label> <input type=\"text\" name=\"email\" id=\"em\">");
        ca.println("<br/>");
        ca.println("Last Name: <input type=\"text\" name=\"lname\" id=\"ln\">");
        ca.println("<br/>");
        ca.println("First Name: <input type=\"text\" name=\"fname\" id=\"fn\">");
        ca.println("<br/>");
        ca.println("Username: <input type=\"text\" name=\"uname\" id=\"un\">");
        ca.println("<br/>");
        ca.println("Password: <input type=\"password\" name=\"pwd\" id=\"pd\">");
        ca.println("<br/>");
        ca.println("<input type=\"submit\" name=\"createacc\" value=\"Sign Up\" method=\"POST\" id=\"createBtn\">");
        ca.println("</div>");
        ca.println("</form>");
        ca.println("</body>");
        ca.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
