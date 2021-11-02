package xg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xg.beans.Log;
import xg.dao.LogDao;
import xg.service.LogService;

import java.util.List;
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    LogDao dao;
    @Override
    public List<Log> findLogs() {

        return dao.selectLogs();
    }
}
