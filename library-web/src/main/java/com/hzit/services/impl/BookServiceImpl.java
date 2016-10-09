package com.hzit.services.impl;

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

    /**
     * 查询全部
     * @return
     */
    @Override
    public List<Book> All() {
      return bookMapper.searchBookByParams(null);
    }

    /**
     * 分页查询 传一个页数和每页的行数
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

    /**
     * 根据书的ID  查书的 全部信息
     * @param bookId
     * @return
     */
    @Override
    public Book findById(String bookId) {
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
