package com.hzit.controller;

import com.hzit.dao.entity.User;
import com.hzit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping("/tologin")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        User user = userService.findUser(username, password);
        if (user!= null) {
            session.setAttribute("user", user);
            return "redirect:/bookall";
        } else {
            return "redirect:/login.html";
        }
    }

    @RequestMapping("/loginout")
    public String loginout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    @RequestMapping("/toinsert")
    public String toinsert(User user) {

        int num = userService.inset(user);
        if (num == 1) {
            return "redirect:/register_success.html";
        }
        return "redirect:/register.html";
    }

    @RequestMapping("/toregist")
    public String toregist(User user) {
        int num = userService.inset(user);
        return "tegister";
    }
}