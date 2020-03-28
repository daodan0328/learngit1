package com.robot.mybatis.mapper;

import com.robot.pojo.WordAliasT;
import com.robot.pojo.WordAliasTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WordAliasTMapper {
    long countByExample(WordAliasTExample example);

    int deleteByExample(WordAliasTExample example);

    int insert(WordAliasT record);

    int insertSelective(WordAliasT record);

    List<WordAliasT> selectByExample(WordAliasTExample example);

    int updateByExampleSelective(@Param("record") WordAliasT record, @Param("example") WordAliasTExample example);

    int updateByExample(@Param("record") WordAliasT record, @Param("example") WordAliasTExample example);
}