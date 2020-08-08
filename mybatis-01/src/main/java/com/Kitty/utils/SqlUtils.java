package com.Kitty.utils;

import com.dandelion.dao.UserMapper;
import com.dandelion.pojo.User;
import com.dandelion.utils.SQLHelper;
import org.apache.ibatis.session.SqlSession;

public class SqlUtils {

    /**
     * 根据书名获取书籍 ... 其他属性类似
     */
    public static String getPassword(String name) {
        SqlSession sqlSession = SQLHelper.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String pswd = "";

        try {
            pswd = mapper.getPasswordByName(name);
        } catch (Exception e){
            pswd = "";
        }

        sqlSession.close();
        return pswd;
    }
}
