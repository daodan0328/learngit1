package com.robot.mybatis.mapper;

import com.robot.pojo.TemplateAttrValueT;
import com.robot.pojo.TemplateAttrValueTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateAttrValueTMapper {
    long countByExample(TemplateAttrValueTExample example);

    int deleteByExample(TemplateAttrValueTExample example);

    int insert(TemplateAttrValueT record);

    int insertSelective(TemplateAttrValueT record);

    List<TemplateAttrValueT> selectByExample(TemplateAttrValueTExample example);

    int updateByExampleSelective(@Param("record") TemplateAttrValueT record, @Param("example") TemplateAttrValueTExample example);

    int updateByExample(@Param("record") TemplateAttrValueT record, @Param("example") TemplateAttrValueTExample example);
}