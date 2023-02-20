package com.alex.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {
    int x=10;
    int y=10;
    public MyPanel() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillOval(x,y,10,10);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {//键盘按下事件的监听
        System.out.println((char)e.getKeyCode()+"键被按下");
        if (e.getKeyCode()==KeyEvent.VK_UP){
            y--;
        } else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
            y++;
        }else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
            x--;
        }else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
            x++;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
