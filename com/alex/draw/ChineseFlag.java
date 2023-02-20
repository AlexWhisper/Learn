package com.alex.draw;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class ChineseFlag extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // 画背景矩形
        g.setColor(Color.red);
        g.fillRect(0, 0, width, height);

        // 画大星星
        int x1 = width / 3;
        int y1 = height / 3;
        int x2 = 2 * x1;
        int y2 = 2 * y1;
        int[] xPoints = {x1, x2, x1, x2};
        int[] yPoints = {y1, y1, y2, y2};
        g.setColor(Color.yellow);
        g.fillPolygon(xPoints, yPoints, 4);

        // 画小星星
        int d = Math.min(width, height) / 10;
        int r = d / 2;
        int x = (int)(x1 + 2.5 * r);
        int y = (int)(y1 + 2.5 * r);
        g.setColor(Color.yellow);
        g.fillOval(x - r, y - r, d, d);

        // 画四个小星星
        int k = (int)(5.8 * r);
        int[] xs = {x + k, x - k, x - k, x + k};
        int[] ys = {y - k, y - k, y + k, y + k};
        for (int i = 0; i < 4; i++) {
            g.fillOval(xs[i] - r, ys[i] - r, d, d);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Chinese Flag");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ChineseFlag flag = new ChineseFlag();
        frame.add(flag);

        frame.setVisible(true);
    }
}
