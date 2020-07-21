/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Book implements Serializable{
    private Integer BookID;
    private String Title;
    private String Authorname;
    private String Publishername;

    public Book(Integer bookid, String title, String authorname, String publishername) {
        this.BookID = bookid;
        this.Title = title;
        this.Authorname = authorname;
        this.Publishername = publishername;
    }

    public Integer getBookID() {
        return BookID;
    }

    public void setBookID(Integer BookId) {
        this.BookID = BookId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthorname() {
        return Authorname;
    }

    public void setAuthorname(String Authorname) {
        this.Authorname = Authorname;
    }

    public String getPublishername() {
        return Publishername;
    }

    public void setPublishername(String Publishername) {
        this.Publishername = Publishername;
    }
    
    
    
}
