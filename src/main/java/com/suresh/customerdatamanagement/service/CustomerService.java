package com.suresh.customerdatamanagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.suresh.customerdatamanagement.dto.CustomerDTO;
import com.suresh.customerdatamanagement.dto.ResponseStructure;
import com.suresh.customerdatamanagement.entity.CustomerEntity;
import com.suresh.customerdatamanagement.repository.CustomerDAO;
import com.suresh.customerdatamanagement.repository.CustomerRepository;

@Service
public class CustomerService {

	// @Autowired private CustomerRepository repository;

//	
//	public CustomerEntity saveCustomer(CustomerEntity customerEntity)
//	{
//		return repository.save(customerEntity);
//	}
	@Autowired
	private CustomerDAO customerDAO;

	public List<CustomerEntity> validateCustomer(String name, String email) {
		return customerDAO.validateCustomer(name, email);
	}

	public List<CustomerEntity> getCustomerByName(String name) {
		return customerDAO.getCustomerByName(name);
	}

	public ResponseStructure<CustomerEntity> saveCustomer(CustomerDTO dto) {

		CustomerEntity cus = new CustomerEntity();

		 CustomerEntity customer = customerDAO.saveCustomer(cus);
		 
		 ResponseStructure<CustomerEntity> rs = new ResponseStructure<>();
		 rs.setDate(customer);
		 rs.setMessage("Customer Data saved Sucessfully...");
		 rs.setStatusCode(HttpStatus.OK.value());
		 rs.setTimeStamp(LocalDateTime.now());
		return rs;
		 

	}

	public ResponseStructure<CustomerEntity> updateCustomer(CustomerEntity customerEntity) {
		CustomerEntity cus = customerDAO.saveCustomer(customerEntity);

		ResponseStructure<CustomerEntity> rs = new ResponseStructure<>();

		rs.setDate(cus);
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setTimeStamp(LocalDateTime.now());
		rs.setMessage(HttpStatus.ACCEPTED.name());

		return rs;
	}

	public ResponseStructure<List<CustomerEntity>> getAllCustomerData() {
		List<CustomerEntity> list = customerDAO.getAllCustomerData();

		ResponseStructure<List<CustomerEntity>> rs = new ResponseStructure<>();

		if (list.size() != 0) {
			rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setDate(list);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("Customer Entry found in database");
		} else {
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setDate(null);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("NO customer Entry found in database");

		}
		return rs;

	}

	public CustomerEntity getCustomerDataById(int id) {
		return customerDAO.getCustomerDataById(id);
	}

}
//http://localhost:8080/CustomerDataManagement/saveCustomer