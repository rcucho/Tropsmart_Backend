package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.Customer;
import com.techelper.tropsmart_backend.resources.comunications.CustomerResponse;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService extends ICrudService<Customer>{
    CustomerResponse findCustomerById(int customerId);
    CustomerResponse findAllCustomers();
    CustomerResponse rechargeCreditsByCustomerId(int customerId, double creditUnits);

}
