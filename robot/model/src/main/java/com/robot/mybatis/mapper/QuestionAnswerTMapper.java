package com.robot.mybatis.mapper;

import com.robot.pojo.QuestionAnswerT;
import com.robot.pojo.QuestionAnswerTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionAnswerTMapper {
    long countByExample(QuestionAnswerTExample example);

    int deleteByExample(QuestionAnswerTExample example);

    int insert(QuestionAnswerT record);

    int insertSelective(QuestionAnswerT record);

    List<QuestionAnswerT> selectByExampleWithBLOBs(QuestionAnswerTExample example);

    List<QuestionAnswerT> selectByExample(QuestionAnswerTExample example);

    int updateByExampleSelective(@Param("record") QuestionAnswerT record, @Param("example") QuestionAnswerTExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionAnswerT record, @Param("example") QuestionAnswerTExample example);

    int updateByExample(@Param("record") QuestionAnswerT record, @Param("example") QuestionAnswerTExample example);
}