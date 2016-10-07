package com.hzit.controller;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 创建一个拦截器的类
 */
public class CheckUserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        //每当页面进入控制器之前会被执行的方法
        //参数 o 代表了拦截的那个方法
        System.out.println("我是拦截器:有一个请求来了,我拦截了"+o+"");
        System.out.println("访问者:" + request.getRemoteHost());
            HttpSession httpsession=request.getSession();
                if(httpsession.getAttribute("user")==null){
                    response.sendRedirect("../index.jsp");
                    return false;
                }

        //如果该方法返回true 则进入后面的控制器。否则将被拦截，不在继续运行
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
                //控制器执行完毕但还没有进入到页面的时候执行的代码
        System.out.print("方法已经执行完毕，下面进入页面");
        System.out.print("刚刚执行完的方法时"+o);

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("整个控制器执行完毕了");
    }
}
