package cn.edu.aynu.SpringBoot.service.impl;

import cn.edu.aynu.SpringBoot.entity.User;
import cn.edu.aynu.SpringBoot.mapper.UserMapper;
import cn.edu.aynu.SpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUsersByMId(Integer mId) {
        return userMapper.findUsersByMId(mId);
    }

    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
}
