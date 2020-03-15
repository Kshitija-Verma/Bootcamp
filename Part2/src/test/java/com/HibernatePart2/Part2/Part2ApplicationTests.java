package com.HibernatePart2.Part2;

import com.HibernatePart2.Part2.Entities.ComponentMapping.Employees;
import com.HibernatePart2.Part2.Entities.ComponentMapping.Salary;
import com.HibernatePart2.Part2.Entities.Employee;
import com.HibernatePart2.Part2.InheritanceMapping.TablePerClass.CheckPayTC;
import com.HibernatePart2.Part2.Repositeries.ComponentMappingRepository;
import com.HibernatePart2.Part2.Repositeries.EmployeeRepository;
import com.HibernatePart2.Part2.Repositeries.TablePerClassRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Part2ApplicationTests {
	@Autowired
	ComponentMappingRepository componentMappingRepository;

	@Test
	void contextLoads() {
	}
@Test
	public void createEmployeeWithSalary(){
	Employees employees = new Employees();
	Salary salary = new Salary();
	salary.setBasicsalary(34000d);
	salary.setBonussalary(3300d);
	salary.setSpecialallowancesalary(2300d);
	salary.setTaxamount(1200d);
	employees.setSalary(salary);
	employees.setAge(23);
	employees.setFirstname("Kshivi");
	employees.setLastname("Rajput");
	employees.setId(3);
	componentMappingRepository.save(employees);
}

}
