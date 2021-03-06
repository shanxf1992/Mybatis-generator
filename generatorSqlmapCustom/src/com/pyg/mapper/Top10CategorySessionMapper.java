package com.pyg.mapper;

import com.pyg.pojo.Top10CategorySession;
import com.pyg.pojo.Top10CategorySessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Top10CategorySessionMapper {
    int countByExample(Top10CategorySessionExample example);

    int deleteByExample(Top10CategorySessionExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(Top10CategorySession record);

    int insertSelective(Top10CategorySession record);

    List<Top10CategorySession> selectByExample(Top10CategorySessionExample example);

    Top10CategorySession selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") Top10CategorySession record, @Param("example") Top10CategorySessionExample example);

    int updateByExample(@Param("record") Top10CategorySession record, @Param("example") Top10CategorySessionExample example);

    int updateByPrimaryKeySelective(Top10CategorySession record);

    int updateByPrimaryKey(Top10CategorySession record);
}