package com.robot.mybatis.mapper;

import com.robot.pojo.ApplicationT;
import com.robot.pojo.ApplicationTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationTMapper {
    long countByExample(ApplicationTExample example);

    int deleteByExample(ApplicationTExample example);

    int insert(ApplicationT record);

    int insertSelective(ApplicationT record);

    List<ApplicationT> selectByExample(ApplicationTExample example);

    int updateByExampleSelective(@Param("record") ApplicationT record, @Param("example") ApplicationTExample example);

    int updateByExample(@Param("record") ApplicationT record, @Param("example") ApplicationTExample example);
}