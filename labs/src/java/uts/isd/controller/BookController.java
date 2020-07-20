/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;
import java.io.IOException;

   import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

   import java.sql.SQLException;
import java.sql.Statement;

   import java.util.logging.Level;

   import java.util.logging.Logger;

   import javax.servlet.ServletException;

   import javax.servlet.http.HttpServlet;

   import javax.servlet.http.HttpServletRequest;

   import javax.servlet.http.HttpServletResponse;

   import javax.servlet.http.HttpSession;
import uts.isd.model.Book;


/**
 *
 * @author User
 */
public class BookController extends HttpServlet{
    

public static void doPost(HttpServletRequest request) throws SQLException, ClassNotFoundException{
    String URL = "jdbc:derby://localhost:1527/bookdb";
    String dbuser = "mofan";
    String dbpass = "123456";
    String driver = "org.apache.derby.jdbc.ClientDriver"; 
    Class.forName(driver); 
    Connection conn = DriverManager.getConnection(URL, dbuser, dbpass);
    String bookid = request.getParameter("BookID");
    String title = request.getParameter("Title");
    String authorname = request.getParameter("Authorname");
    String publishername = request.getParameter("Publishername");
    
    Book book = new Book(bookid,title,authorname,publishername);
    
    try{
        Statement st = conn.createStatement();
        int result = st.executeUpdate("INSERT INTO BOOK bookid,title,suthor,publisher"
        + "VALUES(+Book.getBookID()+,+Book.getTitle(),+Book.getAuthorname(),+Book.getPublishername())");
        st.close();
    } catch (Exception e) {
        System.out.println("Error -" + e.toString());
    }
        
    
    }
    
}


