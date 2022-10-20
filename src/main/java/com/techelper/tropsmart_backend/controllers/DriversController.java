package com.techelper.tropsmart_backend.controllers;

import com.techelper.tropsmart_backend.resources.comunications.DriverResponse;
import com.techelper.tropsmart_backend.resources.comunications.ReviewResponse;
import com.techelper.tropsmart_backend.servicesImp.DriverService;
import com.techelper.tropsmart_backend.servicesImp.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/drivers")
public class DriversController {

    @Autowired
    private DriverService driverService;

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public ResponseEntity<DriverResponse> findAllDrivers()
    {
        DriverResponse result = driverService.findAllDrivers();

        //if(!result.success)
        //    return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/{driverId}")
    public ResponseEntity<DriverResponse> findDriverById(@PathVariable(value = "driverId") int driverId)
    {
        DriverResponse result = driverService.findDriverById(driverId);

        //if(!result.success)
        //    return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/{driverId}/reviews")
    public ResponseEntity<ReviewResponse> findReviewsByDriverId(@PathVariable(value = "driverId")int driverId)
    {
        ReviewResponse result = reviewService.findReviewsByDriverId(driverId);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
