package com.example.group1_complainttrackingsystem_marcos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FileComplaintServlet", value = "/filecomplaint")
public class FileComplaintServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter fc =  response.getWriter();
        fc.println("<html>");
        fc.println("<head>");

        fc.println("<title>GCTS</title>");

        fc.println("<style>");
        fc.println("body{");
        fc.println("background: linear-gradient(to right, #9c27b0, #8ecdff);");
        fc.println("overflow: hidden");
        fc.println("}");
        fc.println("h1{");
        fc.println("text-align: center;");
        fc.println("font-family: 'Iron Bridge';");
        fc.println("font-size: 50px;");
        fc.println("color: white;");
        fc.println("width: 100%");
        fc.println("position: relative;");
        fc.println("}");
        fc.println("#comp{");
        fc.println("text-align: center;");
        fc.println("font-family: 'Microsoft YaHei UI';");
        fc.println("font-size: 30px;");
        fc.println("color: white;");
        fc.println("width: 100%");
        fc.println("position: relative;");
        fc.println("}");
        fc.println("#specify{");
        fc.println("text-align: center;");
        fc.println("font-family: 'Microsoft YaHei UI';");
        fc.println("font-size: 20px;");
        fc.println("color: white;");
        fc.println("width: 100%");
        fc.println("position: relative;");
        fc.println("}");
        fc.println(".inputs {");
        fc.println("font-family: 'Microsoft YaHei UI';");
        fc.println("text-align: center;");
        fc.println("color: white;");
        fc.println("}");
        fc.println("#desc {");
        fc.println("margin-bottom: 3px;");
        fc.println("width: 400px;");
        fc.println("height: 150px;");
        fc.println("margin-right: 10px;");
        fc.println("}");
        fc.println("#submitBtn {");
        fc.println("font-family: 'Microsoft YaHei UI';");
        fc.println("background-color: cornflowerblue;");
        fc.println("border: none;");
        fc.println("color: white;");
        fc.println("padding: 15px 32px;");
        fc.println("text-decoration: none;");
        fc.println("font-size: 16px;");
        fc.println("margin-top: 10px;");
        fc.println("}");
        fc.println("</style>");

        fc.println("</head>");

        fc.println("<body>");
        fc.println("<h1>Login Successful!</h1>");
        fc.println("<p id=\"comp\">What is your complaint?</p>");
        fc.println("<br/>");
        fc.println("<form method=\"GET\" action=\"complaintstatus\">");
        fc.println("<p id=\"specify\">Please specify below:</p>");
        fc.println("<div class=\"inputs\">");
        fc.println("<input type=\"textarea\" name=\"complaint\" id=\"desc\"/>");
        fc.println("<br/>");
        fc.println("<button type=\"submit\" id=\"submitBtn\">Submit</button>");
        fc.println("</div>");
        fc.println("</form>");
        fc.println("</body>");
        fc.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
