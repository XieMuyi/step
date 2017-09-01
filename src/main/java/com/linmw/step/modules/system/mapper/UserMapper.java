package com.linmw.step.modules.system.mapper;

import com.linmw.step.modules.system.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {


    @Select("select * from t_user where id = #{id}")
    User getOne(long id);
}
