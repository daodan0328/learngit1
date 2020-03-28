package com.robot.mybatis.mapper;

import com.robot.pojo.MatchRuleT;
import com.robot.pojo.MatchRuleTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatchRuleTMapper {
    long countByExample(MatchRuleTExample example);

    int deleteByExample(MatchRuleTExample example);

    int insert(MatchRuleT record);

    int insertSelective(MatchRuleT record);

    List<MatchRuleT> selectByExample(MatchRuleTExample example);

    int updateByExampleSelective(@Param("record") MatchRuleT record, @Param("example") MatchRuleTExample example);

    int updateByExample(@Param("record") MatchRuleT record, @Param("example") MatchRuleTExample example);
}