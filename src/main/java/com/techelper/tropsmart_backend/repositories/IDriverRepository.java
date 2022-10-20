package com.techelper.tropsmart_backend.repositories;

import com.techelper.tropsmart_backend.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDriverRepository extends JpaRepository<Driver, Integer> {
}
