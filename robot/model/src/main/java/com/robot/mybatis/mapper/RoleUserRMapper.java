package com.robot.mybatis.mapper;

import com.robot.pojo.RoleUserR;
import com.robot.pojo.RoleUserRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleUserRMapper {
    long countByExample(RoleUserRExample example);

    int deleteByExample(RoleUserRExample example);

    int insert(RoleUserR record);

    int insertSelective(RoleUserR record);

    List<RoleUserR> selectByExample(RoleUserRExample example);

    int updateByExampleSelective(@Param("record") RoleUserR record, @Param("example") RoleUserRExample example);

    int updateByExample(@Param("record") RoleUserR record, @Param("example") RoleUserRExample example);
}