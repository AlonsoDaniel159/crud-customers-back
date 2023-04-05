package com.alonso.customerscrud.service;

import com.alonso.customerscrud.model.Customer;

import java.util.List;

public interface ICustomerService {

    Customer save(Customer customer) throws Exception;
    Customer update(Customer customer) throws Exception;
    List<Customer> findAll() throws Exception;
    Customer findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
