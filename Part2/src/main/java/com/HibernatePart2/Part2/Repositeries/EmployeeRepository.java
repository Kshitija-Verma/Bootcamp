package com.HibernatePart2.Part2.Repositeries;

import com.HibernatePart2.Part2.Entities.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    @Query("select firstName,lastName from Employee where salary >(select avg(salary) from Employee) ORDER BY age ASC,salary DESC")
    List<Object[]> salaryGreaterThanAvg();

   @Query("select avg(salary) from Employee")
   public Double avgSalary();

  @Modifying
    @Query("UPDATE Employee SET salary=:upsalary where salary<:avgsalary" )
    public void updateSalaryLessThanAvg(@Param("upsalary") Double salary,@Param("avgsalary") Double avgsalary);

    @Query(value = "select emp_id , emp_first_name, emp_age from employee_table where emp_last_name=:lastName",nativeQuery = true)
    List<Object[]> findEmployeeByLastName(@Param("lastName")String lastName);
@Modifying
@Transactional
    @Query(value = "delete from employee_table where emp_age>:age",nativeQuery = true)
    public void deleteByAge(@Param("age")Integer age);

}
