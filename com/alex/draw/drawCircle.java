package com.alex.draw;

import com.alex.Poly01_.PolyParmeter.Manger;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class drawCircle extends JFrame {
    private MyPanel mp=null;
    public static void main(String[] args) {
        new drawCircle();
    }

    public drawCircle(){
        mp=new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10,10,100,100);
    }
}
