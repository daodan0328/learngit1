package com.robot.mybatis.mapper;

import com.robot.pojo.QuestionCentralT;
import com.robot.pojo.QuestionCentralTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionCentralTMapper {
    long countByExample(QuestionCentralTExample example);

    int deleteByExample(QuestionCentralTExample example);

    int insert(QuestionCentralT record);

    int insertSelective(QuestionCentralT record);

    List<QuestionCentralT> selectByExample(QuestionCentralTExample example);

    int updateByExampleSelective(@Param("record") QuestionCentralT record, @Param("example") QuestionCentralTExample example);

    int updateByExample(@Param("record") QuestionCentralT record, @Param("example") QuestionCentralTExample example);
}