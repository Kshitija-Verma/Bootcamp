package com.RestfulApp2.RestfulApp2.Filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StaticFilterController {
    @GetMapping("/static-filtering")
    public StaticBean retrieveSomeBean(){
        return  new StaticBean("value1","value2","value3");
    }
    @GetMapping("/static-filtering-list")
    public List<StaticBean> retrieveBeanList(){
        return  Arrays.asList(new StaticBean("value1","value2","value3"),new StaticBean("value1","value2","value3"));
    }
}
