package com.HibernatePart2.Part2.Repositeries;

import com.HibernatePart2.Part2.Entities.ComponentMapping.Employees;
import org.springframework.data.repository.CrudRepository;

public interface ComponentMappingRepository extends CrudRepository<Employees,Integer> {
}
