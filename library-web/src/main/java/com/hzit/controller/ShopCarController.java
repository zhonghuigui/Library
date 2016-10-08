package com.hzit.controller;

import com.hzit.dao.entity.Book;
import com.hzit.dao.vo.BookVo;
import com.hzit.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
@RequestMapping("/car")
public class ShopCarController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/putcar")
    //@ResponseBody
    public String putcar(@RequestParam(value = "bookId",defaultValue ="") String[] bookId,HttpSession session){
        //创建购物车对象,先假设 session中有购物车对象，如果没有则创建购物车对象
        Map car=(Map)session.getAttribute("car");
        if(car==null){
            car=new HashMap();
        }
        for(int i=0;bookId!=null&&i<bookId.length;i++){
            //System.out.println(bookId[i]);
            String strId=bookId[i];
            //通过图片ID 获取图片对象
            Book book=bookService.findById(strId);
            BookVo v=new BookVo();
            v.setBookCount(book.getBookCount());
            v.setBookId(book.getBookId());
            v.setBookName(book.getBookName());
            v.setBookPrice(book.getBookPrice());
            v.setBookPicture(book.getBookPicture());
            //如果购买的商品中 有相同的 ，购物车中的购买数量则要加一 ，否则为1
            BookVo b=(BookVo)car.get(v.getBookId());
                if(b==null){
                    v.setCount(1);
                }else {
                    v.setCount(b.getCount()+1);
                }
            //把对象放入到购物车
            car.put(v.getBookId(),v);
        }
        session.setAttribute("car", car);
        //System.out.println("gogo");
        return "redirect:/car/toshopping";
    }


    @RequestMapping("/updatebook")
    @ResponseBody
    public Object u(@RequestParam("bookId") String bookId,@RequestParam("count")Integer count,HttpSession session){
        //System.out.println("修改了编号为"+bookId+"的数量，新的值是"+count);
        Map car=(Map)session.getAttribute("car");
        BookVo v=(BookVo)car.get(bookId);
        if(v!=null){
            v.setCount(count);
        }

        int su=0;
         Collection<BookVo> cc=car.values();
        for(BookVo t:cc){
            su+= t.getCount()*t.getBookPrice();
        }

        session.setAttribute("car",car);
        return su;
    }


    @RequestMapping("/toshopping")
    public String s(){
    return "shopping";
    }
}
