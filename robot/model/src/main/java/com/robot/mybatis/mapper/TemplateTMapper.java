package com.robot.mybatis.mapper;

import com.robot.pojo.TemplateT;
import com.robot.pojo.TemplateTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateTMapper {
    long countByExample(TemplateTExample example);

    int deleteByExample(TemplateTExample example);

    int insert(TemplateT record);

    int insertSelective(TemplateT record);

    List<TemplateT> selectByExample(TemplateTExample example);

    int updateByExampleSelective(@Param("record") TemplateT record, @Param("example") TemplateTExample example);

    int updateByExample(@Param("record") TemplateT record, @Param("example") TemplateTExample example);
}