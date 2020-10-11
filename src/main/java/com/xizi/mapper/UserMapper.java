package com.xizi.mapper;

import com.xizi.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserMapper {
     //查询所有的用户
     List<User> queryUserList();
     //根据Id查询用户
     List<User> queryUserById(Integer id);
     //添加用户
     void addUser(User user);
     //更新用户
     void updateUser(User user);
     //删除用户
     void delete(Integer id);
}
