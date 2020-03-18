package com.mappingassignment.mapping.repo;

import com.mappingassignment.mapping.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Author,Integer>
{

}
