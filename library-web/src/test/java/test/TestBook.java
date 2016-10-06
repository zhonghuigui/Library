package test;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;
import com.hzit.services.BookService;
import com.sun.tools.javadoc.Start;
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
@SpringApplicationConfiguration(Start.class)
public class TestBook {

    @Autowired
    private BookService bookService;
    @Test
    public void Page(){
        Page<Book> p=bookService.findByPage(0, 2);
        List<Book> l=p.getContent();
        for(Book s:l){
            System.out.println(s.getBookName());
        }
        System.out.println("总行数"+p.getTotalElements());
        System.out.println("总页数"+p.getTotalPages());
    }

}
