/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.scode.Author;
import com.scode.Book;

/**
 *
 * @author fedora
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Author c1 = new Author("First Candidate");
        Author c2 = new Author("Second Candidate");
        
        Book p1 = new Book("Student",c1);
        Book p2 = new Book("Student",c2);
        
        System.out.println(p1.getAuthor());
    }
    
}
