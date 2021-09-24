package bacit.web.bacit_web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterUserServlet", value = "/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html");

            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("title");
            out.println("register user form/title");
            out.println("</head>");
            out.println("<body");
            out.println("<h2> Registrer Bruker </2h>");
            out.println("<form action'/register_user' method= 'POST'");
            out.println("label for='fullName'> Fullt Navn </label>");
            out.println("<input type 'text' name= 'fullname'/>");
            out.println("<input type 'text' name= 'phone'/>");
            out.println("<input type 'submit' value='Registrer Bruker'/>");
            out.println("<form>");
            out.println("</body>");
            out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            response.setContentType("text/html");
            request.getParameter("fullname");
    }
}