package com.robot.mybatis.mapper;

import com.robot.pojo.QuestionExtendT;
import com.robot.pojo.QuestionExtendTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionExtendTMapper {
    long countByExample(QuestionExtendTExample example);

    int deleteByExample(QuestionExtendTExample example);

    int insert(QuestionExtendT record);

    int insertSelective(QuestionExtendT record);

    List<QuestionExtendT> selectByExampleWithBLOBs(QuestionExtendTExample example);

    List<QuestionExtendT> selectByExample(QuestionExtendTExample example);

    int updateByExampleSelective(@Param("record") QuestionExtendT record, @Param("example") QuestionExtendTExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionExtendT record, @Param("example") QuestionExtendTExample example);

    int updateByExample(@Param("record") QuestionExtendT record, @Param("example") QuestionExtendTExample example);
}