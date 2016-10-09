package com.hzit.services;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface BookService {

    /**
     * 查询全部
     * @return
     */
    List<Book> All();

    /**
     * 分页查询
     * @param page
     * @param row
     * @return
     */
    Page<Book> findByPage(int page,int row);



    /**
     * 根据ID查图书的全部信息
     * @param bookId
     * @return
     */
    Book findById(String bookId);

}
