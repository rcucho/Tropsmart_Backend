package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.Driver;
import com.techelper.tropsmart_backend.models.Location;
import com.techelper.tropsmart_backend.resources.comunications.DriverResponse;

public interface IDriverService extends ICrudService<Driver> {
    DriverResponse findNearDrivers(Location location);
    DriverResponse findDriverById(int driverId);
    DriverResponse findAllDrivers();
}
