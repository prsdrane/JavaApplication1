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
public class Author {
    public Author(String name) {
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    private String name;
}
