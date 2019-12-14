package com.lanhusoft.model;

import lombok.Data;

/**
 * Copyright www.lanhusoft.com
 * Author:Apex Zheng
 * Date:2019/12/11
 * Description:
 */
@Data
public class Book {
    private String id;
    private String title;
    private String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
