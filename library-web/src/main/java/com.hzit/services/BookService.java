package com.hzit.services;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface BookService {

    Page<Book> findByPage(int page,int row);

    List<Book> All();

    Book findById(String bookId);
}
