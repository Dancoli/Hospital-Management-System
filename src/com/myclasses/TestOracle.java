package com.myclasses;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
@WebServlet(name = "ttest")
public class TestOracle extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        try {
            Context context = new InitialContext();
            DataSource dataSource = (DataSource) context.lookup("java:jboss/datasources/danco");
            Connection connection1 = dataSource.getConnection();
            if (connection1 != null) {
                out.println("<h1>Connection Successful to ORACLE</h1>");

            } else {
                out.println("<h1>Connection FAILED to ORACLE</h1>");
            }
        } catch (NamingException ne) {
            out.println("NamingException " + ne.getMessage());
        } catch (SQLException se) {
            out.println("SQLException " + se.getMessage());
        }

    }
}
