package com.example.group1_complainttrackingsystem_marcos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ComplaintStatusServlet", value = "/complaintstatus")
public class ComplaintStatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter css =  response.getWriter();
        css.println("<html>");
        css.println("<head>");

        css.println("<title>GCTS</title>");

        css.println("<style>");
        css.println("body{");
        css.println("background: linear-gradient(to right, #9c27b0, #8ecdff);");
        css.println("overflow: hidden");
        css.println("}");
        css.println("h1{");
        css.println("text-align: center;");
        css.println("font-family: 'Iron Bridge';");
        css.println("font-size: 50px;");
        css.println("color: white;");
        css.println("width: 100%");
        css.println("position: relative;");
        css.println("}");
        css.println("#eml{");
        css.println("text-align: center;");
        css.println("font-family: 'Microsoft YaHei UI';");
        css.println("font-size: 20px;");
        css.println("color: white;");
        css.println("width: 100%");
        css.println("position: relative;");
        css.println("}");
        css.println("#ty{");
        css.println("text-align: center;");
        css.println("font-family: 'Microsoft YaHei UI';");
        css.println("font-size: 20px;");
        css.println("color: white;");
        css.println("width: 100%");
        css.println("position: relative;");
        css.println("}");
        css.println("#cancelBtn {");
        css.println("text-align: center;");
        css.println("font-family: 'Microsoft YaHei UI';");
        css.println("background-color: cornflowerblue;");
        css.println("border: none;");
        css.println("color: white;");
        css.println("padding: 15px 32px;");
        css.println("text-decoration: none;");
        css.println("font-size: 16px;");
        css.println("margin-top: 10px;");
        css.println("margin-bottom: 100px;");
        css.println("}");
        css.println("#editBtn {");
        css.println("text-align: center;");
        css.println("font-family: 'Microsoft YaHei UI';");
        css.println("background-color: black;");
        css.println("border: none;");
        css.println("color: white;");
        css.println("padding: 15px 32px;");
        css.println("text-decoration: none;");
        css.println("font-size: 16px;");
        css.println("margin-top: 10px;");
        css.println("}");
        css.println("#logoutBtn {");
        css.println("text-align: center;");
        css.println("font-family: 'Microsoft YaHei UI';");
        css.println("background-color: black;");
        css.println("border: none;");
        css.println("color: white;");
        css.println("padding: 15px 32px;");
        css.println("text-decoration: none;");
        css.println("font-size: 16px;");
        css.println("}");
        css.println(".inputs {");
        css.println("text-align: center;");
        css.println("}");
        css.println("</style>");

        css.println("</head>");

        css.println("<body>");
        css.println("<h1>Complaint Status: Pending</h1>");
        css.println("<p id=\"eml\">We will email you after we check your complaint.</p>");
        css.println("<p id=\"ty\">Thank you.</p>");
        css.println("<br/>");
        css.println("<div class=\"inputs\">");
        css.println("<form method=\"GET\" action=\"index.jsp\">");
        css.println("<button type=\"submit\" id=\"cancelBtn\">Cancel</button>");
        css.println("<br/>");
        css.println("</form>");
        css.println("<form method=\"GET\" action=\"edit\">");
        css.println("<button type=\"submit\" id=\"editBtn\">Edit Account</button>");
        css.println("<br/>");
        css.println("</form>");
        css.println("<form method=\"GET\" action=\"login\">");
        css.println("<button type=\"submit\" id=\"logoutBtn\">Logout</button>");
        css.println("</form>");
        css.println("</div>");
        css.println("</body>");
        css.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
