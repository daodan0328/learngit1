package com.robot.mybatis.mapper;

import com.robot.pojo.WordEntryT;
import com.robot.pojo.WordEntryTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WordEntryTMapper {
    long countByExample(WordEntryTExample example);

    int deleteByExample(WordEntryTExample example);

    int insert(WordEntryT record);

    int insertSelective(WordEntryT record);

    List<WordEntryT> selectByExample(WordEntryTExample example);

    int updateByExampleSelective(@Param("record") WordEntryT record, @Param("example") WordEntryTExample example);

    int updateByExample(@Param("record") WordEntryT record, @Param("example") WordEntryTExample example);
}