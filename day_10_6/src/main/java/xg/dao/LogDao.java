package xg.dao;

import org.springframework.stereotype.Repository;
import xg.beans.Log;

import java.util.List;
@Repository
public interface LogDao {
    List<Log> selectLogs();
}
