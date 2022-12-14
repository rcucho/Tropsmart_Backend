package com.techelper.tropsmart_backend.repositories;

import com.techelper.tropsmart_backend.models.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConfigurationRepository extends JpaRepository<Configuration, Integer> {


}
