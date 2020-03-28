package com.robot.mybatis.mapper;

import com.robot.pojo.RoleT;
import com.robot.pojo.RoleTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleTMapper {
    long countByExample(RoleTExample example);

    int deleteByExample(RoleTExample example);

    int insert(RoleT record);

    int insertSelective(RoleT record);

    List<RoleT> selectByExample(RoleTExample example);

    int updateByExampleSelective(@Param("record") RoleT record, @Param("example") RoleTExample example);

    int updateByExample(@Param("record") RoleT record, @Param("example") RoleTExample example);
}