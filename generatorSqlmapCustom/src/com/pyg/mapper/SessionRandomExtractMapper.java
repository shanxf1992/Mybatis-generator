package com.pyg.mapper;

import com.pyg.pojo.SessionRandomExtract;
import com.pyg.pojo.SessionRandomExtractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionRandomExtractMapper {
    int countByExample(SessionRandomExtractExample example);

    int deleteByExample(SessionRandomExtractExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(SessionRandomExtract record);

    int insertSelective(SessionRandomExtract record);

    List<SessionRandomExtract> selectByExample(SessionRandomExtractExample example);

    SessionRandomExtract selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") SessionRandomExtract record, @Param("example") SessionRandomExtractExample example);

    int updateByExample(@Param("record") SessionRandomExtract record, @Param("example") SessionRandomExtractExample example);

    int updateByPrimaryKeySelective(SessionRandomExtract record);

    int updateByPrimaryKey(SessionRandomExtract record);
}