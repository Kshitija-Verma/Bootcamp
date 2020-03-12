package com.JpaWithHibernate.JpaWithHibernate.Repository;

import com.JpaWithHibernate.JpaWithHibernate.Dao.Employee;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

//Question-2

public interface JpaRepository extends CrudRepository<Employee,Integer> {

    List<Employee> findByName(String shyam);

    List<Employee> findByNameLike(String s);

    List<Employee> findByAgeBetween(int i, int i1);
}
