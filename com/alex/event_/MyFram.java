package com.alex.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class MyFram extends JFrame {
    private MyPanel mp=null;
    public static void main(String[] args) {
        new MyFram();
    }

    public MyFram() throws HeadlessException {
        mp=new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(1000,750);
        this.setVisible(true);


    }
}
