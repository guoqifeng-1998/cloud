package xg.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xg.beans.Dept;

import java.util.List;

@FeignClient("provider-dept")
public interface DeptClientService {
    @GetMapping("/dept/{id}")
    Dept get(@PathVariable("id") long id);


    @GetMapping( "/dept")
    List<Dept> list();
}