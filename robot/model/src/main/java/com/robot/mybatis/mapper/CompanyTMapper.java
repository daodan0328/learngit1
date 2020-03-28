package com.robot.mybatis.mapper;

import com.robot.pojo.CompanyT;
import com.robot.pojo.CompanyTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyTMapper {
    long countByExample(CompanyTExample example);

    int deleteByExample(CompanyTExample example);

    int insert(CompanyT record);

    int insertSelective(CompanyT record);

    List<CompanyT> selectByExample(CompanyTExample example);

    int updateByExampleSelective(@Param("record") CompanyT record, @Param("example") CompanyTExample example);

    int updateByExample(@Param("record") CompanyT record, @Param("example") CompanyTExample example);
}