package xg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xg.beans.Dept;

import java.util.List;

//@RestController
public class DeptCtrlConsumer {
    //static String url="http://localhost:8001";
    static String url="http://provider-dept";
    @Autowired//
    RestTemplate tmp;
    @GetMapping("/consumer/dept/{id}")
    public Dept get(@PathVariable Integer id){
        return tmp.getForObject(url+"/dept/"+id,Dept.class);
    }
    @GetMapping("/consumer/dept")
    public List<Dept> getall(){
        return tmp.getForObject(url+"/dept",List.class);
    }
}