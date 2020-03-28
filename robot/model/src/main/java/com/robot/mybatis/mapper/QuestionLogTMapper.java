package com.robot.mybatis.mapper;

import com.robot.pojo.QuestionLogT;
import com.robot.pojo.QuestionLogTExample;
import com.robot.pojo.QuestionLogTWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionLogTMapper {
    long countByExample(QuestionLogTExample example);

    int deleteByExample(QuestionLogTExample example);

    int insert(QuestionLogTWithBLOBs record);

    int insertSelective(QuestionLogTWithBLOBs record);

    List<QuestionLogTWithBLOBs> selectByExampleWithBLOBs(QuestionLogTExample example);

    List<QuestionLogT> selectByExample(QuestionLogTExample example);

    int updateByExampleSelective(@Param("record") QuestionLogTWithBLOBs record, @Param("example") QuestionLogTExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionLogTWithBLOBs record, @Param("example") QuestionLogTExample example);

    int updateByExample(@Param("record") QuestionLogT record, @Param("example") QuestionLogTExample example);
}