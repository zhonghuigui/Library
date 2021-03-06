package com.hzit.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Order;
import com.hzit.dao.entity.User;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.OrderVo;
import com.hzit.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/addorder")
    public Object addOrder(HttpSession session) {
        try {  //从session获取用户对象
            User user = (User) session.getAttribute("user");
            //从session获取购物车对象
            Map<Integer, BookVo> car = (Map) session.getAttribute("car");
            Collection<BookVo> values = car.values();
            List list = new ArrayList();
            //将购物车转移到集合中，
            for (BookVo bookVo : values) {
                list.add(bookVo);
            }
            OrderVo o = new OrderVo();
            o.setUserId(user.getUserId());
            o.setBookVoList(list);
            boolean bool = orderService.addOrder(o);
            return "redirect:/shopping-success.html";
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    @RequestMapping("/findallorder")
    public String findAllorder(ModelMap modelMap, HttpSession session) {
        User user = (User) session.getAttribute("user");
        List<OrderVo> list = orderService.findAll(user.getUserId());
        modelMap.put("list", list);
      modelMap.put("userid",user.getUserId());
        return "orderlist";
    }

    /**
     * 分页查询订单数据
     * @param page
     * @param modelMap
     * @param session
     * @return
     */
    @RequestMapping("/orderpage")
    public String getAll( @RequestParam(name = "page", defaultValue = "0") Integer page, ModelMap modelMap,HttpSession session) {
        User user = (User) session.getAttribute("user");
        String userId=user.getUserId();
        Page<OrderVo> list = orderService.findByPage(userId, page, 4);
        modelMap.put("list", list);
        modelMap.put("currpage",page);
        return "orderlist";
    }
}