/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scode;

/**
 *
 * @author fedora
 */
public class Book {
    
    public Book(String book,Author c) {
        this.book = book;
        addAuthor(c);
    }
    
    public void addAuthor(Author c) {
        author = resizeArray(author, 1);
        author[author.length-1]=c;
    }
    
    private Author[] resizeArray(Author[] c,int extendBy) {
        Author[] result = new Author[c.length+extendBy];
        
        for(int i=0;i<c.length;i++) {
            result[i] = c[i];
        }
        
        return result;
    }

    public String getProfession() {
        return book;
    }

    public Author[] getAuthor() {
        return author;
    }
    
    
    
    private String book;
    Author[] author = new Author[0];
}
