package com.techelper.tropsmart_backend.repositories;

import com.techelper.tropsmart_backend.models.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRouteRepository extends JpaRepository<Route, Integer> {
}
