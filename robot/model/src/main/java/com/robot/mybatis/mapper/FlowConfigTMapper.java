package com.robot.mybatis.mapper;

import com.robot.pojo.FlowConfigT;
import com.robot.pojo.FlowConfigTExample;
import com.robot.pojo.FlowConfigTWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowConfigTMapper {
    long countByExample(FlowConfigTExample example);

    int deleteByExample(FlowConfigTExample example);

    int insert(FlowConfigTWithBLOBs record);

    int insertSelective(FlowConfigTWithBLOBs record);

    List<FlowConfigTWithBLOBs> selectByExampleWithBLOBs(FlowConfigTExample example);

    List<FlowConfigT> selectByExample(FlowConfigTExample example);

    int updateByExampleSelective(@Param("record") FlowConfigTWithBLOBs record, @Param("example") FlowConfigTExample example);

    int updateByExampleWithBLOBs(@Param("record") FlowConfigTWithBLOBs record, @Param("example") FlowConfigTExample example);

    int updateByExample(@Param("record") FlowConfigT record, @Param("example") FlowConfigTExample example);
}