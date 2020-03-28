package com.robot.testMybatis;

import com.alibaba.fastjson.JSONObject;
import com.robot.mybatis.mapper.ConfigDataTMapper;
import com.robot.pojo.ConfigDataT;
import com.robot.pojo.ConfigDataTExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Create By: 刘建
 * Date: 2020/3/23
 * Time: 6:44 下午
 * Description: No Description
 */
public class TestMybatis {
    private static SqlSession sqlSession;

    public static SqlSession getSession() throws IOException {
        if (sqlSession == null) {
            String resource = "mybatis/mybatis-config.xml";
            InputStream is = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sqlSession = sqlSessionFactory.openSession();
        }
        return sqlSession;
    }

    public static void main(String[] args) throws IOException {
        testInsert();
    }

    /**
     * 测试插入
     */
    private static void testInsert() throws IOException {
        ConfigDataTMapper configDataTMapper = TestMybatis.getSession().getMapper(ConfigDataTMapper.class);
        ConfigDataTExample configDataTExample = new ConfigDataTExample();
        ConfigDataTExample.Criteria criteria = configDataTExample.createCriteria();
        criteria.andConfigTypeCodeEqualTo("服务功能开启关系配置");
        List<ConfigDataT> configDataTList = configDataTMapper.selectByExample(configDataTExample);
        System.out.println(JSONObject.toJSONString(configDataTList));
    }
}
