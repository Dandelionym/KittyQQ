package com.Kitty.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QQ {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton regButton;
    private JButton logButton;

    /***
     * 给登录按钮添加事件，当用户填写完用户名密码后进行后台数据库校验
     */
    public QQ() {
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginActionPerformed(e);
            }
        });
    }

    /***
     * 登录校验事件
     */
    private void LoginActionPerformed(ActionEvent e) {
        String username = this.textField1.getText();
        String password = new String(this.passwordField1.getPassword());
        if(StringUtils.isEmpty(username)){
            JOptionPane.showMessageDialog(null, "用户名不能为空！");
        }
        if(StringUtils.isEmpty(password)){
            JOptionPane.showMessageDialog(null, "密码不能为空！");
        }
    }

    /***
     * 用户启动程序后登录时看到的界面。需要输入用户名密码登录
     */
    public void init() {
        JFrame frame = new JFrame("KittyQQ v1.0");
        frame.setBounds(675, 160, 250, 315);
        frame.setBackground(new Color(225, 255, 255));
        frame.setContentPane(new QQ().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new QQ().init();
    }
}

