package xg.service;

import xg.beans.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept d);
    Dept get(Integer id);
    List<Dept> list();
}