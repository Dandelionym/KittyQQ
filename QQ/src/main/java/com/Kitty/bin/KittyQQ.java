/**
 *  主界面
 */

package com.Kitty.bin;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.PanelUI;
import java.awt.*;

public class KittyQQ {

    public void init(){
        JFrame kettyQQ = new JFrame("");
        kettyQQ.setVisible(true);
        kettyQQ.setBounds(730, 315, 250, 315);
        kettyQQ.setBackground(new Color(225, 255, 255));
        kettyQQ.setResizable(false);
        kettyQQ.setLayout(null);

        //        JPanel head = new JPanel();
        //        //        head.setUI(new PanelUI() {
        //        //            @Override
        //        //            public void paint(Graphics g, JComponent c) {
        //        //                g.setColor(new Color(0, 0, 0));
        //        //                g.fillOval(70, 20, 100, 100);
        //        //            }
        //        //        });
        //        //        kettyQQ.add(head);

        JLabel head = new JLabel(new ImageIcon("head.png"));
        System.out.println(head);
        System.out.println("....");
        head.setBounds(70, 20, 100, 100);
        kettyQQ.add(head);


        JTextField username = new JTextField("2350833815");
        username.setBorder(new MatteBorder(0, 0, 1, 0, new Color(255, 255, 255, 40)));
        username.setBackground(new Color(255, 255, 255));
        username.setBounds(50, 170, 150, 30);
        kettyQQ.add(username);

        JTextField password = new JPasswordField("123123123");
        password.setBorder(new MatteBorder(0, 0, 1, 0, new Color(255, 255, 255, 40)));
        password.setBackground(new Color(255, 255, 255));
        password.setBounds(50, 210, 150, 30);
        kettyQQ.add(password);



        kettyQQ.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new KittyQQ().init();






    }
}
