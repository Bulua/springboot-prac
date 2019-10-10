package cn.edu.aynu.SpringBoot.service;

import cn.edu.aynu.SpringBoot.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findUsersByMId(Integer mId);

    public int deleteUserById(Integer id);
}
