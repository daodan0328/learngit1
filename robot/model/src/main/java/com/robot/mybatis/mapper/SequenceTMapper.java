package com.robot.mybatis.mapper;

import com.robot.pojo.SequenceT;
import com.robot.pojo.SequenceTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceTMapper {
    long countByExample(SequenceTExample example);

    int deleteByExample(SequenceTExample example);

    int insert(SequenceT record);

    int insertSelective(SequenceT record);

    List<SequenceT> selectByExample(SequenceTExample example);

    int updateByExampleSelective(@Param("record") SequenceT record, @Param("example") SequenceTExample example);

    int updateByExample(@Param("record") SequenceT record, @Param("example") SequenceTExample example);
}