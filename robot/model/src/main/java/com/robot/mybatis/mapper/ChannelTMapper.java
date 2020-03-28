package com.robot.mybatis.mapper;

import com.robot.pojo.ChannelT;
import com.robot.pojo.ChannelTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelTMapper {
    long countByExample(ChannelTExample example);

    int deleteByExample(ChannelTExample example);

    int insert(ChannelT record);

    int insertSelective(ChannelT record);

    List<ChannelT> selectByExample(ChannelTExample example);

    int updateByExampleSelective(@Param("record") ChannelT record, @Param("example") ChannelTExample example);

    int updateByExample(@Param("record") ChannelT record, @Param("example") ChannelTExample example);
}