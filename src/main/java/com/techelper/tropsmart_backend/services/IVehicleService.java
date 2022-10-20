package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.Vehicle;
import com.techelper.tropsmart_backend.resources.comunications.VehicleResponse;
import com.techelper.tropsmart_backend.resources.inputs.VehicleInput;

public interface IVehicleService extends ICrudService<Vehicle> {
    VehicleResponse findVehiclesByDriverId(int driverId);
    VehicleResponse addVehicleByUserId(int driverId, VehicleInput vehicleInput);
    VehicleResponse findAllVehicles();
    VehicleResponse findVehicleById(int vehicleId);
}
