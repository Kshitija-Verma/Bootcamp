package com.HibernatePart2.Part2.Controller;

import com.HibernatePart2.Part2.Entities.Employee;
import com.HibernatePart2.Part2.Repositeries.EmployeeRepository;
import com.sun.javafx.scene.layout.region.SliceSequenceConverter;
import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.provider.PersistenceProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/create")
    public ResponseEntity<Object> createEmployee(@Valid @RequestBody Employee employee){
        Employee employees = employeeRepository.save(employee);
        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employees.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/display")
    public Iterable<Employee> displayEmployee(){
       return employeeRepository.findAll();
    }
    @GetMapping("/avgSalary")
    public List<Object[]> findAllSalaryGreaterThanAvg(){
       return employeeRepository.salaryGreaterThanAvg();

    }

    @GetMapping("/updateSalary")
    public void updateSalary(){
        employeeRepository.updateSalaryLessThanAvg(30000d, employeeRepository.avgSalary());
    }

@GetMapping("/find-by-lastname")
    List<Object[]> findAllEmployeesByLastName(){
        return employeeRepository.findEmployeeByLastName("Singh");
}
@GetMapping("/delete-by-age")
    public void deleteEmployeesByAge(){
        employeeRepository.deleteByAge(45);
}

}
