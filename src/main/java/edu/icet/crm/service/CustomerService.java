package edu.icet.crm.service;

import edu.icet.crm.dto.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    void addDetails(Customer customer);
// void updateCustomer(Customer customer);
// void deleteCustomerAccById(Integer id);
   // Customer searchItemsById(Integer id);
}
