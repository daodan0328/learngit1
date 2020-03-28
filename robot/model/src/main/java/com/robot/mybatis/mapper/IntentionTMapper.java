package com.robot.mybatis.mapper;

import com.robot.pojo.IntentionT;
import com.robot.pojo.IntentionTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntentionTMapper {
    long countByExample(IntentionTExample example);

    int deleteByExample(IntentionTExample example);

    int insert(IntentionT record);

    int insertSelective(IntentionT record);

    List<IntentionT> selectByExample(IntentionTExample example);

    int updateByExampleSelective(@Param("record") IntentionT record, @Param("example") IntentionTExample example);

    int updateByExample(@Param("record") IntentionT record, @Param("example") IntentionTExample example);
}