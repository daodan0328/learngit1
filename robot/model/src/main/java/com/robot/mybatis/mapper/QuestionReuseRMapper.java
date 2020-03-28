package com.robot.mybatis.mapper;

import com.robot.pojo.QuestionReuseR;
import com.robot.pojo.QuestionReuseRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionReuseRMapper {
    long countByExample(QuestionReuseRExample example);

    int deleteByExample(QuestionReuseRExample example);

    int insert(QuestionReuseR record);

    int insertSelective(QuestionReuseR record);

    List<QuestionReuseR> selectByExample(QuestionReuseRExample example);

    int updateByExampleSelective(@Param("record") QuestionReuseR record, @Param("example") QuestionReuseRExample example);

    int updateByExample(@Param("record") QuestionReuseR record, @Param("example") QuestionReuseRExample example);
}