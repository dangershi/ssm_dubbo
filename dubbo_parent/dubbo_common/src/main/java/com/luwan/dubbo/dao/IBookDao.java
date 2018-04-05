package com.luwan.dubbo.dao;

import com.luwan.dubbo.bean.Book;

public interface IBookDao {
    int deleteByPrimaryKey(String bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(String bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}