package com.hzit.controller;

import com.hzit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/toadduser")
    public String toadduser(ModelMap modelMap){
      List<com.hzit.dao.entity.User> list=userService.findAll();
        modelMap.put("list",list);
      return "register";
    }

}
