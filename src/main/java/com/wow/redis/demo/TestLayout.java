package com.wow.redis.demo;

import javax.swing.*;
import java.awt.*;

/**
 * 测试布局
 */
public class TestLayout {

    public static void main(String[] args) {
        TestLayout tl = new TestLayout();
//        tl.layout();
//        tl.layout1();
        tl.layout2();
    }

    private JFrame create(){
        JFrame frame = new JFrame();
        frame.setSize(1024,768);
        frame.setLocation(new Point(100,100));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    private JFrame setLayout(JFrame frame,LayoutManager layoutManager){
        frame.setLayout(layoutManager);
        return frame;
    }

    /**
     * border layout
     */
    public void layout(){
        JFrame frame = setLayout(create(),new BorderLayout());
        JButton button1 = new JButton("Top");
        JButton button2 = new JButton("Left");
        JButton button3 = new JButton("Center");
        JButton button4 = new JButton("Right");
        JButton button5 = new JButton("Bottom");
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.WEST);
        frame.add(button3,BorderLayout.CENTER);
        frame.add(button4,BorderLayout.EAST);
        frame.add(button5,BorderLayout.SOUTH);
        frame.setBounds(100,400,800,300);
        frame.setVisible(true);

    }

    /**
     * flow layout
     */
    public void layout1(){
        JFrame frame = create();
        JPanel panel = new JPanel();
        for(int i = 0;i<5;i++){
            JButton btn = new JButton(String.valueOf(i+1));
            btn.setSize(40,40);
            panel.add(btn);
        }
        panel.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
        panel.setBackground(Color.GRAY);
        frame.add(panel);
        frame.setVisible(true);
    }

    /**
     * card layout
     */
    public void layout2(){
        JFrame frame = create();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel cards = new JPanel(new CardLayout());
        panel1.add(new JButton("登录按钮"));
        panel1.add(new JButton("注册按钮"));
        panel1.add(new JButton("找回密码按钮"));
        panel2.add(new JTextField("用户名文本框",20));
        panel2.add(new JTextField("密码文本框",20));
        panel2.add(new JTextField("验证码文本框",20));
        cards.add(panel1,"card1");
        cards.add(panel2,"card2");
        CardLayout cl=(CardLayout)(cards.getLayout());
        cl.show(cards,"card1");
        frame.add(cards);
        frame.setBounds(300,200,400,200);
        frame.setVisible(true);
    }
}
