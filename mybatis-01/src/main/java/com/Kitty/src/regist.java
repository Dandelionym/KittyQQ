package com.Kitty.src;

import com.Kitty.utils.SqlUtils;
import com.Kitty.utils.StringUtils;
import com.dandelion.dao.UserMapper;
import com.dandelion.pojo.User;
import com.dandelion.utils.SQLHelper;
import org.apache.ibatis.session.SqlSession;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class regist {
    private JPanel panel1;
    private JTextField username;
    private JPasswordField confirm_pswd;
    private JPasswordField password;
    private JTextField provence;
    private JTextField city;
    private JTextField cons;
    private JTextField motto;
    private JButton reButton;
    static JFrame regist_board = new JFrame("Register");


    public regist() {
        reButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterActionPerformed(e);
            }
        });
    }

    public static void init() {
        regist_board.setBounds(400, 115, 870, 820);
        regist_board.setContentPane(new regist().panel1);
        regist_board.setResizable(false);
        regist_board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regist_board.setBackground(Color.pink);
        regist_board.pack();
        regist_board.setVisible(true);
    }

    /***
     * 注册功能，如果通过了校验，则将数据插入到数据库
     * @param e
     */
    public void RegisterActionPerformed(ActionEvent e) {
        String username = this.username.getText();
        String password = new String(this.password.getPassword());
        String confirm_pswd = new String(this.confirm_pswd.getPassword());
        String provence = this.provence.getText();
        String city = this.city.getText();
        String cons = this.cons.getText();
        String motto = this.motto.getText();

        try{
            if(password.equals(confirm_pswd)){
                SqlSession sqlSession = SQLHelper.getSqlSession();
                UserMapper mapper = sqlSession.getMapper(UserMapper.class);

                Boolean status = mapper.insertObj(new User(username, confirm_pswd, provence, city, cons, motto));

                sqlSession.commit();
                sqlSession.close();

                if(status) {
                    System.out.println("注册成功！");
                    regist_board.dispose();
                    new QQ().ref_init();

                }

            }
        } catch (Exception e1){
            JOptionPane.showMessageDialog(null, "注册出错，请稍后再试！");
        }

    }

}


