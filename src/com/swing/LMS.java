/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.*;


/**
 *
 * @author fedora
 */
public class LMS extends JFrame{
    public LMS(){
        super("LMS");
        setSize(780, 560);
        Container c = getContentPane();
        
        menuBar.add(fileMenu);
        
    }
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    
   
}
