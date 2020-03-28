package com.robot.mybatis.mapper;

import com.robot.pojo.FlowElementT;
import com.robot.pojo.FlowElementTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowElementTMapper {
    long countByExample(FlowElementTExample example);

    int deleteByExample(FlowElementTExample example);

    int insert(FlowElementT record);

    int insertSelective(FlowElementT record);

    List<FlowElementT> selectByExample(FlowElementTExample example);

    int updateByExampleSelective(@Param("record") FlowElementT record, @Param("example") FlowElementTExample example);

    int updateByExample(@Param("record") FlowElementT record, @Param("example") FlowElementTExample example);
}