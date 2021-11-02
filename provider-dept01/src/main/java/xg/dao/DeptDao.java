package xg.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xg.beans.Dept;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {
    int addDept(Dept d);
    Dept findById(Integer id);
    List<Dept> findAll();
}