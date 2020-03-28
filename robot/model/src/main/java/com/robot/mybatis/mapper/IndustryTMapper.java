package com.robot.mybatis.mapper;

import com.robot.pojo.IndustryT;
import com.robot.pojo.IndustryTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryTMapper {
    long countByExample(IndustryTExample example);

    int deleteByExample(IndustryTExample example);

    int insert(IndustryT record);

    int insertSelective(IndustryT record);

    List<IndustryT> selectByExample(IndustryTExample example);

    int updateByExampleSelective(@Param("record") IndustryT record, @Param("example") IndustryTExample example);

    int updateByExample(@Param("record") IndustryT record, @Param("example") IndustryTExample example);
}