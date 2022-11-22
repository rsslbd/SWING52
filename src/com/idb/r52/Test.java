package com.idb.r52;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Test extends JFrame{
    static JFrame jf; //null
    public Test() {
        //jf = new JFrame(); //new object
    }  
    public static void main(String[] args) {
        /**
        System.out.println("hello swing");
        JFrame jf = new JFrame();
        jf.setSize(400, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("Employee Management System");
        jf.setVisible(true);
         
        new Test(); //call
        jf.setSize(new Dimension(500, 400));
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
        
        new Test().setVisible(true);
    }
}