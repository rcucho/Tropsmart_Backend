package com.techelper.tropsmart_backend.repositories;

import com.techelper.tropsmart_backend.models.Soat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISoatRepository extends JpaRepository<Soat, Integer> {
}
