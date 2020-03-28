package com.robot.mybatis.mapper;

import com.robot.pojo.UserApplicationR;
import com.robot.pojo.UserApplicationRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserApplicationRMapper {
    long countByExample(UserApplicationRExample example);

    int deleteByExample(UserApplicationRExample example);

    int insert(UserApplicationR record);

    int insertSelective(UserApplicationR record);

    List<UserApplicationR> selectByExample(UserApplicationRExample example);

    int updateByExampleSelective(@Param("record") UserApplicationR record, @Param("example") UserApplicationRExample example);

    int updateByExample(@Param("record") UserApplicationR record, @Param("example") UserApplicationRExample example);
}