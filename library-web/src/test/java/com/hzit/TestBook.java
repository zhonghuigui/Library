package com.hzit;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;
import com.hzit.services.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value=StartApp.class)
public class TestBook {

    @Autowired
    private BookService bookServiceImpl;

    @Test//测试  全部
    public void booklist(){
        List<Book> list=bookServiceImpl.All();
        for(Book b:list){
            System.out.println(b.getBookName());
        }
    }

    @Test//测试  分页
    public void Page(){
       Page<Book> p=bookServiceImpl.findByPage(0,4);
       List<Book> l=p.getContent();
        for(Book s:l){
            System.out.println(s.getBookName());
        }
        System.out.println("总行数"+p.getTotalElements());
        System.out.println("总页数"+p.getTotalPages());
    }

    @Test//测试  根据id查询  全部
    public void byID(){
        Book b=bookServiceImpl.findById("2");
        System.out.println(b.getBookName());
    }
}
