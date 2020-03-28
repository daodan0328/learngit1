package com.robot.mybatis.mapper;

import com.robot.pojo.ConfigDataT;
import com.robot.pojo.ConfigDataTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigDataTMapper {
    long countByExample(ConfigDataTExample example);

    int deleteByExample(ConfigDataTExample example);

    int insert(ConfigDataT record);

    int insertSelective(ConfigDataT record);

    List<ConfigDataT> selectByExample(ConfigDataTExample example);

    int updateByExampleSelective(@Param("record") ConfigDataT record, @Param("example") ConfigDataTExample example);

    int updateByExample(@Param("record") ConfigDataT record, @Param("example") ConfigDataTExample example);
}