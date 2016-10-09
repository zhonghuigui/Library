package com.hzit.services.impl;

import com.hzit.dao.entity.Order;
import com.hzit.dao.entity.Orderdetail;
import com.hzit.dao.entity.User;
import com.hzit.dao.mapper.OrderMapper;
import com.hzit.dao.mapper.OrderdetailMapper;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.OrderVo;
import com.hzit.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2016/10/8.
 */
@Service


public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderdetailMapper orderdetailMapper;
    @Override
    @Transactional  //添加事物支持。如果出现异常该方法的所有操作回滚
    public boolean addOrder(OrderVo order) {
        String orderID= UUID.randomUUID().toString(); //生成一个唯一编号
                //先增加订单表的数据
               Order o=new Order();
               o.setOrderId(orderID);
                 o.setDate(new Date());
              o.setOrderStatus("已下单");
              o.setUserId(order.getUserId());
               int sum=0;  //要用来计算订单总价
                 List<BookVo> orderdetaillist= order.getBookVoList();
               for(BookVo x : orderdetaillist){
                      sum+=x.getCount()*x.getBookPrice();
                    }
                  o.setOrderPrice(sum);
                 orderMapper.insertOrder(o);
                 //再增加详情表的数据，循环增加多行数据
                  for(BookVo x : orderdetaillist){
                         sum+=x.getCount()*x.getBookPrice();
                      Orderdetail orderdetail=new Orderdetail();
                      orderdetail.setOrderId(orderID);
                      orderdetail.setBookId(x.getBookId());
                      orderdetail.setCount(x.getCount());
                      orderdetail.setDealprice(x.getBookPrice());
                      orderdetailMapper.insertOrderdetail(orderdetail);
                    }

        return true;
    }

    @Override
    public List<Order> findAll(User user) {
        return orderMapper.searchOrderByParams(null);
    }
}
