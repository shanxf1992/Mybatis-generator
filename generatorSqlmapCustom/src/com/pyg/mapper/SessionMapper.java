package com.pyg.mapper;

import com.pyg.pojo.Session;
import com.pyg.pojo.SessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionMapper {
    int countByExample(SessionExample example);

    int deleteByExample(SessionExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(Session record);

    int insertSelective(Session record);

    List<Session> selectByExample(SessionExample example);

    Session selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") Session record, @Param("example") SessionExample example);

    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);

    int updateByPrimaryKeySelective(Session record);

    int updateByPrimaryKey(Session record);
}