package xg.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;
import xg.beans.LogData;

@Repository
public interface LogTool {
    @Insert("insert into log (username,operType,moduleName,result,operTime,operContent)" +
            " VALUES (#{username},#{operType},#{moduleName},#{result},now(),#{operContent})")
    void insertLog(LogData d);
}