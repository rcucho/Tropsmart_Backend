package com.techelper.tropsmart_backend.services;


import com.techelper.tropsmart_backend.models.Route;
import com.techelper.tropsmart_backend.resources.comunications.RouteResponse;

public interface IRouteService extends ICrudService<Route> {
    RouteResponse getRouteInfo(int cargoId);
    RouteResponse findAllRoutes();
    RouteResponse findRouteById(int routeId);
}
