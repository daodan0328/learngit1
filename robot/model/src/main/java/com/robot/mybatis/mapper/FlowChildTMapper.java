package com.robot.mybatis.mapper;

import com.robot.pojo.FlowChildT;
import com.robot.pojo.FlowChildTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowChildTMapper {
    long countByExample(FlowChildTExample example);

    int deleteByExample(FlowChildTExample example);

    int insert(FlowChildT record);

    int insertSelective(FlowChildT record);

    List<FlowChildT> selectByExample(FlowChildTExample example);

    int updateByExampleSelective(@Param("record") FlowChildT record, @Param("example") FlowChildTExample example);

    int updateByExample(@Param("record") FlowChildT record, @Param("example") FlowChildTExample example);
}