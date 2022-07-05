package com.wow.redis.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TestAll {

    public static void main(String[] args) {
        TestAll ta = new TestAll();
        ta.show();
    }

    public void show(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(Color.BLUE);
        menuPanel.setSize(800,100);
//        JLabel tempLabel1 = new JLabel("menu");
//        menuPanel.add(tempLabel1);
//        JMenu menu = new JMenu("创建连接(C)");
//        menu.setMnemonic(KeyEvent.VK_C);
        JButton connBtn = new JButton("创建连接(C)");
        connBtn.setBackground(Color.GREEN);
        connBtn.setMnemonic(KeyEvent.VK_C);
        connBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        });
        menuPanel.add(connBtn);

        JPanel treePanel = new JPanel();
        treePanel.setBackground(Color.WHITE);
        treePanel.setSize(200,450);
        JLabel tempLabel2 = new JLabel("tree");
        treePanel.add(tempLabel2);

        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.GRAY);
        contentPanel.setSize(600,450);
        JLabel tempLabel3 = new JLabel("content");
        contentPanel.add(tempLabel3);

        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(Color.RED);
        infoPanel.setSize(800,50);
        JLabel tempLabel4 = new JLabel("info");
        infoPanel.add(tempLabel4);

        frame.add(menuPanel,BorderLayout.NORTH);
        frame.add(treePanel,BorderLayout.WEST);
        frame.add(contentPanel,BorderLayout.CENTER);
        frame.add(infoPanel,BorderLayout.SOUTH);

        frame.setBounds(100,100,800,600);
        frame.setVisible(true);
    }
}
