/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing;

import com.scode.Author;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.text.Style;


/**
 *
 * @author fedora
 */
public class LMS extends JFrame{
    public LMS(){
        super("LMS");
        setSize(new Dimension(780, 780));
        
        Container c = getContentPane();
        
        fileMenu.add(aboutItem);     // add menuitem to menu
        menuBar.add(fileMenu);       // add menu to menu bar
        setJMenuBar(menuBar);       //  add menu bar
        
        
        libCOLabel.setFont(new Font("Monospaced",1,33));        // set Font for label
        titlePanel.add(libCOLabel);                             // add label to titlePanel (new GridLayout(2,1))
        titlePanel.add(libSYLabel);                             // add label to titlePanel (new GridLayout(2,1))
         
        topPanel.add(titlePanel,"Center");
        topPanel.add(titlePanel,"Center");
        
        theTab.add("Welcome",bt1);
	theTab.add("Add Author", bt2);
	theTab.add("Show all Books", bt3);
	theTab.add("Search on ISBN", bt4);
	theTab.add("Search on Price", bt5);
        
        c.setLayout(new BorderLayout());
        c.add(topPanel,"North");
        c.add(theTab,"Center");
        c.add(statusLabel,"South");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem aboutItem = new JMenuItem("About");
    private JLabel libCOLabel = new JLabel("LMS",JLabel.CENTER);
    private JLabel libSYLabel = new JLabel("library sales system",JLabel.CENTER);
    private JPanel titlePanel = new JPanel(new GridLayout(2,1));
    private JPanel topPanel = new JPanel(new BorderLayout(1,1));
    private JTabbedPane theTab = new JTabbedPane(JTabbedPane.LEFT);
    private JLabel statusLabel = new JLabel("Status Page");
    
    
    private JButton bt1 = new JButton("F");
    private JButton bt2 = new JButton("S");
    private JButton bt3 = new JButton("T");
    private JButton bt4 = new JButton("R");
    private JButton bt5 = new JButton("Z");
   // private Author author = new Author();
    
   public static void main(String[] args) {
       LMS lms = new LMS();
   }
}
