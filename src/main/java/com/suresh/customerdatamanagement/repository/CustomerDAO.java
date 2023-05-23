package com.suresh.customerdatamanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpServerErrorException;

import com.suresh.customerdatamanagement.entity.CustomerEntity;

@Repository
public class CustomerDAO {

	@Autowired
	private CustomerRepository customerRepository;

	public List<CustomerEntity> validateCustomer(String name,String email)
	{
		return customerRepository.validateCustomer(name, email);
		
	}
	public List<CustomerEntity> getCustomerByName(String name) {
		return customerRepository.findByName(name);
	}

	public CustomerEntity saveCustomer(CustomerEntity customerEntity) {
		return customerRepository.save(customerEntity);

	}

	public List<CustomerEntity> getAllCustomerData() {
		return customerRepository.findAll();
	}

	public CustomerEntity getCustomerDataById(int id) //
	{
		return customerRepository.findById(id).orElse(new CustomerEntity(HttpStatus.NOT_FOUND.value(),
				HttpStatus.NOT_FOUND.name(), HttpStatus.NOT_FOUND.name()));
	}

	public CustomerEntity deleteCustomerDataById(int id) {
		CustomerEntity customerEntity = getCustomerDataById(id);
		if (customerEntity.getId() != 404) {
			customerRepository.deleteById(id);
		}
		customerRepository.deleteById(id);

		return customerEntity;
	}
}
