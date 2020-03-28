package com.robot.mybatis.mapper;

import com.robot.pojo.BusinessWordT;
import com.robot.pojo.BusinessWordTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessWordTMapper {
    long countByExample(BusinessWordTExample example);

    int deleteByExample(BusinessWordTExample example);

    int insert(BusinessWordT record);

    int insertSelective(BusinessWordT record);

    List<BusinessWordT> selectByExample(BusinessWordTExample example);

    int updateByExampleSelective(@Param("record") BusinessWordT record, @Param("example") BusinessWordTExample example);

    int updateByExample(@Param("record") BusinessWordT record, @Param("example") BusinessWordTExample example);
}