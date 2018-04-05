package com.luwan.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luwan.dubbo.bean.Book;
import com.luwan.dubbo.service.IBookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private IBookService bookService;
	
	@RequestMapping(value="/index.do")
	public String index(){
		
		return "book";
	}
	
	@RequestMapping("/getBookName")
	public String getBookName(Model model, String id){
		Book book = bookService.getBookName(id);
		model.addAttribute(book);
		return "testDubbo";
	}
	
	
}
