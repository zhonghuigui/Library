package com.hzit.services.Impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.dao.entity.Book;
import com.hzit.dao.mapper.BookMapper;
import com.hzit.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> All() {
        return bookMapper.searchBookByParams(null);
    }

    /**
     * 传一个页数和每页的行数
     * @param page
     * @param row
     * @return
     */
    @Override
    public Page<Book> findByPage(int page,int row){
        PageRequest pr=new PageRequest(page,row);
        Page<Book> p=bookMapper.searchBookByParams(null, pr);
        return p;
    }

    @Override
    public Book ById(String bookName) {

        return null;
    }

    @Override
    public Book findById(int bookId) {
        Map map= new HashMap();
        map.put("bookId",bookId);
        List<Book> list=bookMapper.searchBookByParams(map);
            if(list.size()==1){
                return list.get(0);
            }else {
                return null;
            }
    }
}
