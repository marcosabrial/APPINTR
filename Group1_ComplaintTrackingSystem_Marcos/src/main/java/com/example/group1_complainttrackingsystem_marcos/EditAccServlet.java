package com.example.group1_complainttrackingsystem_marcos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EditAccServlet", value = "/edit")
public class EditAccServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter ea = response.getWriter();
        ea.println("<html>");
        ea.println("<head>");

        ea.println("<title>GCTS</title>");

        ea.println("<style>");
        ea.println("body {");
        ea.println("background: linear-gradient(to right, #9c27b0, #8ecdff);");
        ea.println("overflow: hidden;");
        ea.println("}");
        ea.println("h1 {");
        ea.println("text-align: center;");
        ea.println("font-family: 'Iron Bridge';");
        ea.println("font-size: 80px;");
        ea.println("color: white;");
        ea.println("width: 100%;");
        ea.println("position: relative;");
        ea.println("}");
        ea.println(".inputs {");
        ea.println("font-family: 'Microsoft YaHei UI';");
        ea.println("text-align: center;");
        ea.println("color: white;");
        ea.println("}");
        ea.println("#lblemail {");
        ea.println("margin-left: 29px;");
        ea.println("}");
        ea.println("#em {");
        ea.println("margin-bottom: 3px;");
        ea.println("width: 200px;");
        ea.println("height: 20px;");
        ea.println("margin-right: 90px;");
        ea.println("}");
        ea.println("#ln {");
        ea.println("margin-bottom: 3px;");
        ea.println("width: 200px;");
        ea.println("height: 20px;");
        ea.println("margin-right: 102px;");
        ea.println("}");
        ea.println("#fn {");
        ea.println("margin-bottom: 3px;");
        ea.println("width: 200px;");
        ea.println("height: 20px;");
        ea.println("margin-right: 104px;");
        ea.println("}");
        ea.println("#un {");
        ea.println("margin-bottom: 3px;");
        ea.println("width: 200px;");
        ea.println("height: 20px;");
        ea.println("margin-right: 96px;");
        ea.println("}");
        ea.println("#pd {");
        ea.println("margin-bottom: 3px;");
        ea.println("width: 200px;");
        ea.println("height: 20px;");
        ea.println("margin-right: 90px;");
        ea.println("}");
        ea.println("#editBtn {");
        ea.println("font-family: 'Microsoft YaHei UI';");
        ea.println("background-color: #4CAF50;");
        ea.println("border: none;");
        ea.println("color: white;");
        ea.println("padding: 15px 32px;");
        ea.println("text-decoration: none;");
        ea.println("font-size: 16px;");
        ea.println("margin-top: 10px;");
        ea.println("}");
        ea.println("</style>");

        ea.println("</head>");

        ea.println("<body>");
        ea.println("<div class=\"logo\" style=\"text-align: center\">");
        ea.println("<img src=\"brokengadget.png\" width=\"15%\" height=\"30%\">");
        ea.println("</div>");
        ea.println("<h1>");
        ea.println("Edit Account");
        ea.println("</h1>");
        ea.println("<form method=\"GET\" action=\"login\">");
        ea.println("<div class=\"inputs\">");
        ea.println("<label id=\"lblemail\">Email:</label> <input type=\"text\" name=\"email\" id=\"em\" value=\"jameswhite@yahoo.com\">");
        ea.println("<br/>");
        ea.println("Last Name: <input type=\"text\" name=\"lname\" id=\"ln\" value=\"James\">");
        ea.println("<br/>");
        ea.println("First Name: <input type=\"text\" name=\"fname\" id=\"fn\" value=\"White\">");
        ea.println("<br/>");
        ea.println("Username: <input type=\"text\" name=\"uname\" id=\"un\" value=\"james1\">");
        ea.println("<br/>");
        ea.println("Password: <input type=\"password\" name=\"pwd\" id=\"pd\" value=\"Password\">");
        ea.println("<br/>");
        ea.println("<input type=\"submit\" name=\"editacc\" value=\"Save Changes\" method=\"POST\" id=\"editBtn\">");
        ea.println("</div>");
        ea.println("</form>");
        ea.println("</body>");
        ea.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
