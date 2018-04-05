package com.luwan.dubbo.bean;

import java.io.Serializable;

public class Book implements Serializable {
    private String bookId;

    private String bookName;

    private Integer number;

    private static final long serialVersionUID = 1L;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}