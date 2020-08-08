package com.Kitty.src;

import com.Kitty.utils.SqlUtils;
import com.Kitty.utils.StringUtils;

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
    private JFrame frame = new JFrame("KittyQQ v1.0");


    public QQ() {
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginActionPerformed(e);
                frame.dispose();
            }
        });
        regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerActionPerformed(e);
            }
        });
    }

    private void registerActionPerformed(ActionEvent e) {
        registerBoard();
    }

    private void LoginActionPerformed(ActionEvent e) {
        String username = this.textField1.getText();
        String password = new String(this.passwordField1.getPassword());

        System.out.println(username);
        System.out.println(password);

        if(StringUtils.isEmpty(username)){
            JOptionPane.showMessageDialog(null, "账号不能为空！");
            return;
        }

        if(StringUtils.isEmpty(password)){
            JOptionPane.showMessageDialog(null, "密码不能为空！");
            return;
        }

        // 用户认证过程：验证密码
        try{
            Boolean flag = SqlUtils.getPassword(username).equals(password);
            if(flag){
                // 登录成功对状态下，将用户名显示在主面板
                Kitty.setStatus_user(username);
                frame.dispose();
                mainBoard();

            }else{
                JOptionPane.showMessageDialog(null, "账号或密码不正确！");
            }
        } catch (Exception e1){
            JOptionPane.showMessageDialog(null, "出现了意外错误！");
        }
    }

    private static void mainBoard() {
        com.Kitty.src.Kitty.init();
    }

    private static void registerBoard() {
        com.Kitty.src.regist.init();
    }


    private void init() {
        frame.setBounds(675, 160, 320, 115);
        frame.setBackground(new Color(225, 255, 255));
        frame.setContentPane(new QQ().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void ref_init() {
        init();
    }

    public static void main(String[] args) {
        new QQ().init();
    }
}

