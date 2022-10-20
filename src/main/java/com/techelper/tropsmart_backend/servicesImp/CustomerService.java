package com.techelper.tropsmart_backend.servicesImp;

import com.techelper.tropsmart_backend.exception.ResourceNotFoundException;
import com.techelper.tropsmart_backend.models.Balance;
import com.techelper.tropsmart_backend.models.Customer;
import com.techelper.tropsmart_backend.models.Person;
import com.techelper.tropsmart_backend.models.User;
import com.techelper.tropsmart_backend.repositories.IBalanceRepository;
import com.techelper.tropsmart_backend.repositories.ICustomerRepository;
import com.techelper.tropsmart_backend.repositories.IPersonRepository;
import com.techelper.tropsmart_backend.repositories.IUserRepository;
import com.techelper.tropsmart_backend.resources.comunications.CustomerResponse;
import com.techelper.tropsmart_backend.resources.outputs.CustomerOutput;
import com.techelper.tropsmart_backend.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerRepository customerRepository;

    @Autowired
    IPersonRepository personRepository;

    @Autowired
    IUserRepository userRepository;

    @Autowired
    IBalanceRepository balanceRepository;

    @Override
    public Customer save(Customer customer) throws Exception {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        customerRepository.deleteById(id);
    }

    @Override
    public Optional<Customer> findById(Integer id) throws Exception {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> findAll() throws Exception {
        return customerRepository.findAll();
    }

    @Override
    public CustomerResponse findCustomerById(int customerId) {
        try
        {
            Customer getCustomer = customerRepository.findById(customerId).get();
            return new CustomerResponse(new CustomerOutput(getCustomer.getPerson().getUser().getId(),getCustomer.getPerson().getFirstName(),getCustomer.getPerson().getLastName(),getCustomer.getCredits(),getCustomer.getPerson().getUser().getEmail(), getCustomer.getPerson().getPersonType(),getCustomer.getId()));
        }
        catch (Exception e)
        {
            return new CustomerResponse("An error ocurred while getting customer: "+e.getMessage());
        }

    }

    @Override
    public CustomerResponse findAllCustomers() {
        try
        {
            List<Customer> customerList = customerRepository.findAll();
            List<CustomerOutput> customerOutputList = new ArrayList<>();
            for (Customer getCustomer:customerList) {
                Person getPerson = personRepository.findById(getCustomer.getId()).get();
                customerOutputList.add(new CustomerOutput(getCustomer.getPerson().getUser().getId(),getPerson.getFirstName(),getPerson.getLastName(),getCustomer.getCredits(),getCustomer.getPerson().getUser().getEmail(), getCustomer.getPerson().getPersonType(),getCustomer.getId()));
            }
            return new CustomerResponse(customerOutputList);
        }
        catch (Exception e)
        {
            return new CustomerResponse("An error ocurred while getting customer list: "+e.getMessage());
        }

    }

    @Override
    public CustomerResponse rechargeCreditsByCustomerId(int customerId, double creditUnits) {
        try
        {
            Customer getCustomer = customerRepository.findById(customerId)
                    .orElseThrow(()->new ResourceNotFoundException("customer","id",customerId));
            User getUser = userRepository.findUserByPersonId(getCustomer.getPerson().getId())
                    .orElseThrow(()->new ResourceNotFoundException("user","personId",customerId));
            Balance getBalance = getUser.getBalance();

            getBalance.rechargeMoney(creditUnits);

            getBalance = balanceRepository.save(getBalance);

            getCustomer.setCredits(getCustomer.getCredits()+creditUnits);

            getCustomer = customerRepository.save(getCustomer);

            return new CustomerResponse(new CustomerOutput(getCustomer.getPerson().getUser().getId(),getCustomer.getPerson().getFirstName(),getCustomer.getPerson().getLastName(),getCustomer.getCredits(),getCustomer.getPerson().getUser().getEmail(), getCustomer.getPerson().getPersonType(),getCustomer.getId()));

        }
        catch (Exception e)
        {
            return new CustomerResponse("An error ocurred while rechart credits on user"+e.getMessage());
        }
    }


}