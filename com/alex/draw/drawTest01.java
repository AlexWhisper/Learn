package com.alex.draw;

import javax.swing.*;
import java.awt.*;

public class drawTest01 extends JFrame {
    private JPanel mp=null;
    public drawTest01() throws HeadlessException {
        mp=new myPanel03();
        this.add(mp);
        this.setSize(960,960);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new drawTest01();

    }
}
class myPanel03 extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画了一条斜线
//        g.drawLine(10,10,100,100);
        //画了一个矩形
//        g.drawRect(10,10,100,100);
        //画了一个⚪
//        g.drawOval(10,10,100,100);
        //设置画笔颜色，画了填充矩形和填充填充圆形
        g.setColor(Color.green);
        g.fillOval(10,10,100,100);
        g.fillRect(200,200,50,50);

        //绘制图片

        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.jpg"));
        g.drawImage(image,10,10,960,960,this);

        //绘制字符串
        g.setFont(new Font("微软雅黑",Font.BOLD,50));
        g.drawString("hello world",100,100);

        
    }
}
