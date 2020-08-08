package com.Kitty.src;

import com.dandelion.dao.UserMapper;
import com.dandelion.pojo.User;
import com.dandelion.utils.SQLHelper;
import org.apache.ibatis.session.SqlSession;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class search {
    private JTextField qqNumber;
    private JPanel panel1;
    private JButton searchButton;
    private JFrame frame = new JFrame("搜索好友");

    public search() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchFriend();
            }


        });
    }

    private void searchFriend() {
        String add_qq = this.qqNumber.getText();

        SqlSession sqlSession = SQLHelper.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        // 根据用户名搜索用户添加到好友列表中：
            // 获取当前用户
            String user_now = "1";

        // 建立好友关系
        Boolean status = mapper.insert_friend(user_now, add_qq);

        System.out.println(status);





        sqlSession.close();
    }

    public void init() {
        frame.setBounds(400, 115, 870, 820);
        frame.setContentPane(new search().panel1);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.pink);
        frame.pack();
        frame.setVisible(true);
    }



}