package com.Kitty.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kitty {
    private  JPanel panel1;
    private  JButton addButton;
    private  JTextField msgBox;
    private  JTextField jTextField;
    private  JButton postButton;
    private  JButton settingButton;
    private  JList friendList;
    private  JButton chatButton;
    private  JButton friendButton3;
    private  JButton activeButton4;
    private  JButton button1;
    private  JTextField textField1;
    private  JList chatBox;

    private  String status;
    private  static String status_user = "";

    public static String getStatus_user() {
        return status_user;
    }

    public static void setStatus_user(String status_user) {
        Kitty.status_user = status_user;
    }

    public Kitty() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("...");
                AddFriends(e);
            }
        });


    }


    private void AddFriends(ActionEvent e) {
        new search().init();
    }


    /***
     * 登录成功后看到的主面板
     */
    public static void init() {
        String now_user = getStatus_user();
        if(!now_user.equals("")) {
            JFrame frame_kitty = new JFrame("当前用户："+now_user+"    在线");
            frame_kitty.setContentPane(new Kitty().panel1);
            frame_kitty.setBounds(400, 115, 670, 520);
            frame_kitty.setResizable(false);
            frame_kitty.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame_kitty.setBackground(Color.pink);
            frame_kitty.pack();
            frame_kitty.setVisible(true);
        } else {
            System.exit(0);
        }
    }
}
