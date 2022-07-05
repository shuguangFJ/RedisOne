package com.wow.redis;

import javax.swing.*;
import java.awt.*;

/**
 * 测试布局
 */
public class TestLayout {

    public static void main(String[] args) {

    }

    private JFrame create(){
        JFrame frame = new JFrame();
        frame.setLocation(new Point(100,100));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public void layout(){
        JFrame frame = create();

    }
}
