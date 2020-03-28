package com.robot.mybatis.mapper;

import com.robot.pojo.WordCategoryT;
import com.robot.pojo.WordCategoryTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WordCategoryTMapper {
    long countByExample(WordCategoryTExample example);

    int deleteByExample(WordCategoryTExample example);

    int insert(WordCategoryT record);

    int insertSelective(WordCategoryT record);

    List<WordCategoryT> selectByExample(WordCategoryTExample example);

    int updateByExampleSelective(@Param("record") WordCategoryT record, @Param("example") WordCategoryTExample example);

    int updateByExample(@Param("record") WordCategoryT record, @Param("example") WordCategoryTExample example);
}