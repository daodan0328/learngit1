package com.robot.mybatis.mapper;

import com.robot.pojo.FlowParamT;
import com.robot.pojo.FlowParamTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowParamTMapper {
    long countByExample(FlowParamTExample example);

    int deleteByExample(FlowParamTExample example);

    int insert(FlowParamT record);

    int insertSelective(FlowParamT record);

    List<FlowParamT> selectByExample(FlowParamTExample example);

    int updateByExampleSelective(@Param("record") FlowParamT record, @Param("example") FlowParamTExample example);

    int updateByExample(@Param("record") FlowParamT record, @Param("example") FlowParamTExample example);
}