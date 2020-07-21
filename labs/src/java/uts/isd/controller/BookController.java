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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

   import javax.servlet.http.HttpServletRequest;

   import javax.servlet.http.HttpServletResponse;

   import javax.servlet.http.HttpSession;
import uts.isd.model.Book;


/**
 *
 * @author User
 */
@WebServlet("/controller")
public class BookController extends HttpServlet{
    
    /**
     *
     * @param request
     * @param response
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    String URL = "jdbc:derby://localhost:1527/bookdb";
    String dbuser = "mofan";
    String dbpass = "123456";
    String driver = "org.apache.derby.jdbc.ClientDriver"; 
        try { 
            Class.forName(driver);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String i = request.getParameter("BookID");
    int bookid = Integer.parseInt(i);
    String title = request.getParameter("Title");
    String authorname = request.getParameter("Authorname");
    String publishername = request.getParameter("Publishername");
    
    Book book = new Book(bookid,title,authorname,publishername);
    
    try{
        Connection conn = DriverManager.getConnection(URL, dbuser, dbpass);
        Statement st = conn.createStatement();
        int result = st.executeUpdate("INSERT INTO BOOK (BOOKID,TITLE,AUTHORNAME,PUBLISHERNAME)"
        + "VALUES("+book.getBookID()+",'"+book.getTitle()+"','"+book.getAuthorname()+"','"+book.getPublishername()+"')");
        st.close();
    } catch (Exception e) {
        System.out.println("Error -" + e.toString());
    }
        
    
    }
    
}


