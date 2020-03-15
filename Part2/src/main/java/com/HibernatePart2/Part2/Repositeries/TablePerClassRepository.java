package com.HibernatePart2.Part2.Repositeries;

import com.HibernatePart2.Part2.InheritanceMapping.TablePerClass.PaymentTC;
import org.springframework.data.repository.CrudRepository;

public interface TablePerClassRepository extends CrudRepository<PaymentTC,Integer> {
}
