package com.robot.mybatis.mapper;

import com.robot.pojo.UserT;
import com.robot.pojo.UserTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTMapper {
    long countByExample(UserTExample example);

    int deleteByExample(UserTExample example);

    int insert(UserT record);

    int insertSelective(UserT record);

    List<UserT> selectByExample(UserTExample example);

    int updateByExampleSelective(@Param("record") UserT record, @Param("example") UserTExample example);

    int updateByExample(@Param("record") UserT record, @Param("example") UserTExample example);
}