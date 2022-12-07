package com.restapiexample.repository;

import com.restapiexample.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonsRepository extends JpaRepository<Persons,String> {
}
