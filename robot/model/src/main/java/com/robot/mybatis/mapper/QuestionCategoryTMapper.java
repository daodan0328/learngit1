package com.robot.mybatis.mapper;

import com.robot.pojo.QuestionCategoryT;
import com.robot.pojo.QuestionCategoryTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionCategoryTMapper {
    long countByExample(QuestionCategoryTExample example);

    int deleteByExample(QuestionCategoryTExample example);

    int insert(QuestionCategoryT record);

    int insertSelective(QuestionCategoryT record);

    List<QuestionCategoryT> selectByExample(QuestionCategoryTExample example);

    int updateByExampleSelective(@Param("record") QuestionCategoryT record, @Param("example") QuestionCategoryTExample example);

    int updateByExample(@Param("record") QuestionCategoryT record, @Param("example") QuestionCategoryTExample example);
}