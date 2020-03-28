package com.robot.mybatis.mapper;

import com.robot.pojo.TemplateAttrT;
import com.robot.pojo.TemplateAttrTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateAttrTMapper {
    long countByExample(TemplateAttrTExample example);

    int deleteByExample(TemplateAttrTExample example);

    int insert(TemplateAttrT record);

    int insertSelective(TemplateAttrT record);

    List<TemplateAttrT> selectByExample(TemplateAttrTExample example);

    int updateByExampleSelective(@Param("record") TemplateAttrT record, @Param("example") TemplateAttrTExample example);

    int updateByExample(@Param("record") TemplateAttrT record, @Param("example") TemplateAttrTExample example);
}