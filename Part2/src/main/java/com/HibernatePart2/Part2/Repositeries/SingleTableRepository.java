package com.HibernatePart2.Part2.Repositeries;

import com.HibernatePart2.Part2.InheritanceMapping.SingleTable.PaymentST;
import org.springframework.data.repository.CrudRepository;

public interface SingleTableRepository extends CrudRepository<PaymentST,Integer> {
}
