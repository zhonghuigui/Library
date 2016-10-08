package com.hzit.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;
import com.hzit.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/10/6.
 */

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/booklist")
    @ResponseBody
    public Object getBooklist(){

        return bookService.All();
    }

    @RequestMapping("/bookpage")
    public String getAll(@RequestParam(name="page",defaultValue = "0") Integer page ,ModelMap modelMap){

        Page<Book> list=bookService.findByPage(page,4);

        modelMap.put("list",list);
        modelMap.put("currpage",page);
        return "index";
    }




}
