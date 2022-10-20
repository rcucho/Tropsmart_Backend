package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.Service;
import com.techelper.tropsmart_backend.resources.comunications.ServiceResponse;

public interface IServiceService extends ICrudService<Service> {
    ServiceResponse findSomeServiceByDriverId(int driverId);
    ServiceResponse findServicesByDriverId(int driverId);
    ServiceResponse findAllServices();
    ServiceResponse createService(int driverId);
}
