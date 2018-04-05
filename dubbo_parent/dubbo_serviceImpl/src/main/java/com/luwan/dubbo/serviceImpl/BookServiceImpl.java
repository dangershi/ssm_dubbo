package com.luwan.dubbo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luwan.dubbo.bean.Book;
import com.luwan.dubbo.dao.IBookDao;
import com.luwan.dubbo.service.IBookService;

@Service("bookService")
public class BookServiceImpl implements IBookService{

	@Autowired
	private IBookDao bookDao;
	
	@Override
	public Book getBookName(String id) {
		return bookDao.selectByPrimaryKey(id);
	}

}
