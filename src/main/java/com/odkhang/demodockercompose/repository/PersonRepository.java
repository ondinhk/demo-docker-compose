package com.odkhang.demodockercompose.repository;

import com.odkhang.demodockercompose.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
