package com.JpaWithHibernate.JpaWithHibernate;

import com.JpaWithHibernate.JpaWithHibernate.Dao.Employee;
import com.JpaWithHibernate.JpaWithHibernate.Repository.JpaRepository;
import com.JpaWithHibernate.JpaWithHibernate.Repository.PagingRepository;
import org.graalvm.compiler.loop.InductionVariable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import sun.security.krb5.internal.crypto.Des;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class JpaWithHibernateApplicationTests {
	@Autowired
	JpaRepository jpaRepository;
	@Autowired
	PagingRepository pagingRepository;


	@Test
	void contextLoads() {
	}
	//Question-3
	@Test
	public void createEmployee(){
		Employee employee = new Employee();

		employee.setName("Kshitija");
		employee.setAge(21);
		employee.setId(1);
		employee.setLocation("Modinagar");
		jpaRepository.save(employee);
		employee.setName("Disha");
		employee.setAge(31);
		employee.setId(2);
		employee.setLocation("Delhi");
		jpaRepository.save(employee);
		employee.setName("Anamika");
		employee.setAge(23);
		employee.setId(3);
		employee.setLocation("Meerut");
		jpaRepository.save(employee);
		employee.setName("Sonia");
		employee.setAge(29);
		employee.setId(4);
		employee.setLocation("Hapur");
			jpaRepository.save(employee);

	}
	//Question-4
@Test
	public void testUpdate(){
		Employee employee = jpaRepository.findById(2).get();
		employee.setLocation("Mumbai");
		jpaRepository.save(employee);


	}
	//Question-5
	@Test
	public void testDelete(){
		jpaRepository.deleteById(3);
	}
//Question-5
	@Test
	public void testRead(){
		Employee employee = jpaRepository.findById(1).get();
		assertNotNull(employee);
		assertEquals("Kshitija",employee.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>"+employee.getLocation());
	}
	//Question-6
@Test
	public void testCount(){
	System.out.println(">>>>>>>>>>>>>>>>"+jpaRepository.count());
}
//Question-7
@Test
	public void testPageableAndSorting(){
	Pageable pageable = PageRequest.of(0,2, Sort.Direction.DESC,"age");
	pagingRepository.findAll(pageable).forEach(p->System.out.println(p.getName()));
}
//Question-8
@Test
public void testFindByName(){
	List<Employee> employeeList = jpaRepository.findByName("Kshitija");
	employeeList.forEach(p-> System.out.println(p.getId()+" " + p.getAge()
			+" "+ p.getName() +" "+ p.getLocation() ));
}
//Question-9
@Test
public void testFindByNameLike(){
	List<Employee> employeeList = jpaRepository.findByNameLike("A%");
	employeeList.forEach(p -> System.out.println(p.getId()+" "+p.getAge()+
			" "+p.getName()+" "+p.getLocation()));
}
//Question-10
@Test
public void testFindByAgeBetween(){
	List<Employee> employeeList = jpaRepository.findByAgeBetween(28,32);
	employeeList.forEach(p -> System.out.println(p.getId()+" "+p.getAge()+
			" "+p.getName()+" "+p.getLocation()));
}

}
