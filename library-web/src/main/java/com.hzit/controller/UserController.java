package com.hzit.controller;

import com.hzit.dao.entity.User;
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

    private UserService userServiceImpl;
    @RequestMapping("/index")
    public String login(String username, String password,ModelMap modelMap){
    User user=userServiceImpl.findUser(username, password);

        if (user!=null){
            modelMap.put("user",user);
            return "index";}
        else {
            return "login";
        }
    }

}
