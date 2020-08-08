package com.dandelion.dao;

import com.dandelion.pojo.Book;

import java.util.List;

public interface BookMapper {
    List<Book> getBookList();
    Book getItemByName(String name);
    Boolean insertItem(Book book);
    Boolean updateItem(Book book);
    Boolean deleteItem(int id);
}

