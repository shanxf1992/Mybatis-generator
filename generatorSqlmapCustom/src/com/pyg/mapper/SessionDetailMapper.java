package com.pyg.mapper;

import com.pyg.pojo.SessionDetail;
import com.pyg.pojo.SessionDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionDetailMapper {
    int countByExample(SessionDetailExample example);

    int deleteByExample(SessionDetailExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(SessionDetail record);

    int insertSelective(SessionDetail record);

    List<SessionDetail> selectByExample(SessionDetailExample example);

    SessionDetail selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") SessionDetail record, @Param("example") SessionDetailExample example);

    int updateByExample(@Param("record") SessionDetail record, @Param("example") SessionDetailExample example);

    int updateByPrimaryKeySelective(SessionDetail record);

    int updateByPrimaryKey(SessionDetail record);
}