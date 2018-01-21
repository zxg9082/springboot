package com.it.springboot.mapper;

import com.it.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    public User selectUserById(Integer id);
}
