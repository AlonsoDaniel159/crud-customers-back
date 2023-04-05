package com.alonso.customerscrud.service.Impl;

import com.alonso.customerscrud.model.Customer;
import com.alonso.customerscrud.repository.ICustomerRepository;
import com.alonso.customerscrud.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    ICustomerRepository repo;

    @Override
    public Customer save(Customer customer)throws Exception {
        return repo.save(customer);
    }

    @Override
    public Customer update(Customer customer) throws Exception {
        return repo.save(customer);
    }

    @Override
    public List<Customer> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Customer findById(Integer id) throws Exception {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
