package xg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xg.beans.Dept;
import xg.service.DeptService;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptCtrl_Provider {
    int count=0;
    @Autowired
    DeptService service;
    @PostMapping("")
    //@RequestParam:req.getParams();
    public boolean add(@RequestBody Dept d){
        return service.add(d);
    }
    //localhost:8001/dept/3
    @GetMapping("/{id}")
    public Dept get(@PathVariable Integer id) throws InterruptedException {
        Thread.sleep(0000);
        System.out.println(++count);
        return service.get(id);
    }

    @GetMapping("")
    public List<Dept> get(){
        return service.list();
    }
}