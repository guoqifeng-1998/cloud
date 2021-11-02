package xg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xg.beans.Dept;
import xg.dao.DeptDao;
import xg.service.DeptService;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao dao;
    public boolean add(Dept d) {
        return dao.addDept(d)>0;
    }
    public Dept get(Integer id) {
        return dao.findById(id);
    }
    public List<Dept> list() {
        return dao.findAll();
    }
}