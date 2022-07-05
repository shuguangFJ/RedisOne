package com.wow.redis;

import javax.swing.*;
import java.awt.*;

/**
 * 测试窗口和Label
 */
public class Test1 {

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.showFrame1();
    }

    private void showFrame(){
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jl=new JLabel("这是使用JFrame类创建的窗口");
        frame.getContentPane().add(jl);

        frame.setVisible(true);
    }

    private void showFrame1(){
        JFrame frame = new JFrame();
//        frame.setSize(800,600);
        frame.setLocation(new Point(200,200));
        frame.setBounds(100,200,800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);

        JLabel label = new JLabel("label in panel");
        panel.add(label);
        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }

}
