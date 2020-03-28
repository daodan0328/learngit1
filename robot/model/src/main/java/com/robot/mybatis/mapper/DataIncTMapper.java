package com.robot.mybatis.mapper;

import com.robot.pojo.DataIncT;
import com.robot.pojo.DataIncTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataIncTMapper {
    long countByExample(DataIncTExample example);

    int deleteByExample(DataIncTExample example);

    int insert(DataIncT record);

    int insertSelective(DataIncT record);

    List<DataIncT> selectByExample(DataIncTExample example);

    int updateByExampleSelective(@Param("record") DataIncT record, @Param("example") DataIncTExample example);

    int updateByExample(@Param("record") DataIncT record, @Param("example") DataIncTExample example);
}