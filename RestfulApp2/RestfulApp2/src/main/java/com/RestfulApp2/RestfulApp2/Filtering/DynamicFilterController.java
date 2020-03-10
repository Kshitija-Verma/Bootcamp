package com.RestfulApp2.RestfulApp2.Filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DynamicFilterController {
    @GetMapping("/dynamic-filtering")
    public MappingJacksonValue  retrieveBean(){
        DynamicBean dynamicBean = new DynamicBean("value1","value2","value3");
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
        FilterProvider filters = new SimpleFilterProvider().addFilter("dynamicfilter",filter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(dynamicBean);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
    @GetMapping("/dynamic-filtering-list")
    public MappingJacksonValue retrieveBeanList(){
        List<DynamicBean> list = Arrays.asList(new DynamicBean("value1","value2","value3"),new DynamicBean("value1","value2","value3"));
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2","field3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("dynamicfilter",filter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
}
