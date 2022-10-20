package com.techelper.tropsmart_backend.repositories;

import com.techelper.tropsmart_backend.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository<Person,Integer> {

}
