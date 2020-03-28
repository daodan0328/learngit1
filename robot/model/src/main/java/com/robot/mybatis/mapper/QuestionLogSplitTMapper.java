package com.robot.mybatis.mapper;

import com.robot.pojo.QuestionLogSplitT;
import com.robot.pojo.QuestionLogSplitTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionLogSplitTMapper {
    long countByExample(QuestionLogSplitTExample example);

    int deleteByExample(QuestionLogSplitTExample example);

    int insert(QuestionLogSplitT record);

    int insertSelective(QuestionLogSplitT record);

    List<QuestionLogSplitT> selectByExampleWithBLOBs(QuestionLogSplitTExample example);

    List<QuestionLogSplitT> selectByExample(QuestionLogSplitTExample example);

    int updateByExampleSelective(@Param("record") QuestionLogSplitT record, @Param("example") QuestionLogSplitTExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionLogSplitT record, @Param("example") QuestionLogSplitTExample example);

    int updateByExample(@Param("record") QuestionLogSplitT record, @Param("example") QuestionLogSplitTExample example);
}