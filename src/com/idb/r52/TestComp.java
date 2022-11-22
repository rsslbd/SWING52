package com.idb.r52;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestComp {
    JFrame jf;
    JTextField t; //null
    JButton b;
    public TestComp() {
        jf = new JFrame("New Jframe");
        //jf.setLayout(new FlowLayout());
       
        
        b = new JButton("Click ME");
        jf.setSize(500, 600);
        //b.setSize(250, 50);
        //jf.add(b);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        t = new JTextField("hello");
        t.setBounds(50, 50, 250, 50);
        jf.add(t);
    }
    
    public static void main(String[] args) {
        new TestComp();
    }
}