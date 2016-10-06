package com.hzit.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;
import com.hzit.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2016/10/6.
 */

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/bookall")
    public String getAll(@RequestParam("page") int page ,ModelMap modelMap){

        Page<Book> list=bookService.findByPage(page,2);

        modelMap.put("list",list);
        return "index";
    }
}
