package com.alex.draw;

import javax.swing.*;
import java.awt.*;

public class drawCircle02 extends JFrame {
    private JPanel mp=null;
    public static void main(String[] args) {
        new drawCircle02();
    }

    public drawCircle02() throws HeadlessException {
        mp=new myPanel02();
        this.add(mp);
        this.setSize(400,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
class myPanel02 extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10,10,100,100);
        g.drawOval(20,10,100,100);
        g.drawOval(30,10,100,100);
        g.drawOval(40,10,100,100);
    }
}

