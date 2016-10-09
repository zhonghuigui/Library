package com.hzit.services;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Order;
import com.hzit.dao.entity.User;
import com.hzit.dao.vo.OrderVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface OrderService {
    public boolean addOrder(OrderVo order);
    public List<Order> findAll(Integer userid);
    public Page<Order> findByPage(Integer userid,int page,int row);

}
