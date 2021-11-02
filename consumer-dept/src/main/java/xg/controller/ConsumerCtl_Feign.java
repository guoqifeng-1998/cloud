package xg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xg.beans.Dept;
import xg.service.DeptClientService;

import java.util.List;

@RestController
public class ConsumerCtl_Feign {
  @Autowired
  DeptClientService service;
  @RequestMapping("/consumerFeign/dept/{id}")
  public Dept get(@PathVariable("id")Integer id){
      return service.get(id);
  }
    
  //浏览器中：localhost/consumerFeign/dept/list
  @RequestMapping("/consumerFeign/dept")
  public List<Dept> list(){
      return service.list();
  } 
}