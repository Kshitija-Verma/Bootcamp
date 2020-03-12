package com.JpaWithHibernate.JpaWithHibernate.Repository;

import com.JpaWithHibernate.JpaWithHibernate.Dao.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PagingRepository extends PagingAndSortingRepository<Employee,Integer> {
}
