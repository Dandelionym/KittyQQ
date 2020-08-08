package com.dandelion.dao;

import com.dandelion.pojo.Book;
import com.dandelion.utils.SQLHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;

public class BookDaoTest {

    @Test
    public void QueryAll(){
        /***
         * 查找所有的记录
         */
        SqlSession sqlSession = SQLHelper.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        List<Book> bookList = mapper.getBookList();

        for (Book book : bookList) {
            System.out.println(book);
        }

        sqlSession.close();
    }

    @Test
    public void nameTest() {
        /***
         * 根据书名获取书籍 ... 其他属性类似
         */
        SqlSession sqlSession = SQLHelper.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Book book = mapper.getItemByName("BookA");
        System.out.println(book);
        sqlSession.close();
    }

    @Test
    public void insertTest() {
        /***
         *  插入新记录
         */
        SqlSession sqlSession = SQLHelper.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Boolean status = mapper.insertItem(new Book(4, "1", "2", "3", "2020-06-02", "5"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateTest() {
        /***
         * 更新记录
         */
        SqlSession sqlSession = SQLHelper.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        mapper.updateItem(new Book(4, "Far", "Karl", "America", "2020-6-11", "112-324-546"));

        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void deleteTest() {
        /***
         * 删除记录 ... 按照id删除，其他类似
         */
        SqlSession sqlSession = SQLHelper.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        mapper.deleteItem(4);

        sqlSession.commit();
        sqlSession.close();
    }
}
