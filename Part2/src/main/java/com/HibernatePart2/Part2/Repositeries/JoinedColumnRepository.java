package com.HibernatePart2.Part2.Repositeries;

import com.HibernatePart2.Part2.InheritanceMapping.JoinedColumn.PaymentJC;
import org.springframework.data.repository.CrudRepository;

public interface JoinedColumnRepository extends CrudRepository<PaymentJC,Integer> {

}
