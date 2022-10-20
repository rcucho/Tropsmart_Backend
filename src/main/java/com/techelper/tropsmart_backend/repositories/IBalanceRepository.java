package com.techelper.tropsmart_backend.repositories;

import com.techelper.tropsmart_backend.models.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBalanceRepository extends JpaRepository<Balance, Integer> {

}

// IBalanceRepository
