package com.hzit.services.Impl;

import com.hzit.dao.entity.User;
import com.hzit.dao.mapper.UserMapper;
import com.hzit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(String username, String password) {
        Map map=new HashMap();
        map.put("username",username);
        map.put("password",password);
       List<User> list=userMapper.searchUserByParams(map);
      if(list!=null && list.size()>0){
          return list.get(0);
      }else{
          return null;
      }
    }

    @Override
    public int inset(User user) {
      int num=userMapper.insertUser(user);
        return num;
    }
}
