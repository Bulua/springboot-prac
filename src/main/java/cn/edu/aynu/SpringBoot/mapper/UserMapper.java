package cn.edu.aynu.SpringBoot.mapper;

import cn.edu.aynu.SpringBoot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> findUsersByMId(Integer mId);

    public int deleteUserById(Integer id);
}
