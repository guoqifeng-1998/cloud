package xg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xg.beans.Log;
import xg.service.LogService;

import java.util.List;

@RestController
public class LogCtrl {
    @Autowired
    LogService service;
    @GetMapping("/log")
    public List selectLogs(){
        List<Log>list= service.findLogs();
        return list;
    }
}
