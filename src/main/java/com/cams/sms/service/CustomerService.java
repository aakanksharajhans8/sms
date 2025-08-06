package com.cams.sms.service;

import com.cams.sms.dto.Customer;

import java.util.List;

public interface CustomerService {
    public Customer addCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public Customer getCustomerById(int customerId);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(int customerId);
}
