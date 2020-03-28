package com.robot.mybatis.mapper;

import com.robot.pojo.FlowRuleT;
import com.robot.pojo.FlowRuleTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowRuleTMapper {
    long countByExample(FlowRuleTExample example);

    int deleteByExample(FlowRuleTExample example);

    int insert(FlowRuleT record);

    int insertSelective(FlowRuleT record);

    List<FlowRuleT> selectByExampleWithBLOBs(FlowRuleTExample example);

    List<FlowRuleT> selectByExample(FlowRuleTExample example);

    int updateByExampleSelective(@Param("record") FlowRuleT record, @Param("example") FlowRuleTExample example);

    int updateByExampleWithBLOBs(@Param("record") FlowRuleT record, @Param("example") FlowRuleTExample example);

    int updateByExample(@Param("record") FlowRuleT record, @Param("example") FlowRuleTExample example);
}