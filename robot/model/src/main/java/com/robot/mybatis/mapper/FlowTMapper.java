package com.robot.mybatis.mapper;

import com.robot.pojo.FlowT;
import com.robot.pojo.FlowTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowTMapper {
    long countByExample(FlowTExample example);

    int deleteByExample(FlowTExample example);

    int insert(FlowT record);

    int insertSelective(FlowT record);

    List<FlowT> selectByExample(FlowTExample example);

    int updateByExampleSelective(@Param("record") FlowT record, @Param("example") FlowTExample example);

    int updateByExample(@Param("record") FlowT record, @Param("example") FlowTExample example);
}