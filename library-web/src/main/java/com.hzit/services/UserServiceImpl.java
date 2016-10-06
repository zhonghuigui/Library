package com.hzit.services;

import com.hzit.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<com.hzit.dao.entity.User> findAll() {
        List<com.hzit.dao.entity.User> list = userMapper.searchUserByParams(null);
      return userMapper.searchUserByParams(null);
    }
}
