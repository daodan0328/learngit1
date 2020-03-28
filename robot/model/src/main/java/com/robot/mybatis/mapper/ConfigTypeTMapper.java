package com.robot.mybatis.mapper;

import com.robot.pojo.ConfigTypeT;
import com.robot.pojo.ConfigTypeTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigTypeTMapper {
    long countByExample(ConfigTypeTExample example);

    int deleteByExample(ConfigTypeTExample example);

    int insert(ConfigTypeT record);

    int insertSelective(ConfigTypeT record);

    List<ConfigTypeT> selectByExample(ConfigTypeTExample example);

    int updateByExampleSelective(@Param("record") ConfigTypeT record, @Param("example") ConfigTypeTExample example);

    int updateByExample(@Param("record") ConfigTypeT record, @Param("example") ConfigTypeTExample example);
}