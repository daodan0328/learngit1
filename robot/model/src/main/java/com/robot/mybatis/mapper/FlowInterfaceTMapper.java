package com.robot.mybatis.mapper;

import com.robot.pojo.FlowInterfaceT;
import com.robot.pojo.FlowInterfaceTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowInterfaceTMapper {
    long countByExample(FlowInterfaceTExample example);

    int deleteByExample(FlowInterfaceTExample example);

    int insert(FlowInterfaceT record);

    int insertSelective(FlowInterfaceT record);

    List<FlowInterfaceT> selectByExample(FlowInterfaceTExample example);

    int updateByExampleSelective(@Param("record") FlowInterfaceT record, @Param("example") FlowInterfaceTExample example);

    int updateByExample(@Param("record") FlowInterfaceT record, @Param("example") FlowInterfaceTExample example);
}