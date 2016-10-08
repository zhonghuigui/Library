package com.hzit;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.OrderVo;
import com.hzit.services.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value=StartApp.class)
public class TestOrder {
    @Autowired
    private OrderService orderService;
    @Test
    public void Testadd(){
        OrderVo orderVo=new OrderVo();
        orderVo.setUserId(1);
        BookVo bookVo=new BookVo();
        bookVo.setBookId("2");
        bookVo.setBookPrice(100);
        bookVo.setCount(2);


        BookVo v2=new BookVo();
        v2.setBookId("3");
         v2.setCount(3);
       v2.setBookPrice(100);
        List list=new ArrayList();
        list.add(bookVo);
        list.add(v2);
        orderVo.setBookVoList(list);


        orderService.addOrder(orderVo);

    }
}
