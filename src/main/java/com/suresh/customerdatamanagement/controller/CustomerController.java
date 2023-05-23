package com.suresh.customerdatamanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.customerdatamanagement.dto.CustomerDTO;
import com.suresh.customerdatamanagement.dto.ResponseStructure;
import com.suresh.customerdatamanagement.entity.CustomerEntity;
import com.suresh.customerdatamanagement.service.CustomerService;

@RestController

public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/validatecustomer")
	public List<CustomerEntity> validateCustomer(@RequestParam("name") String name,
			@RequestParam("email") String email) {
		return customerService.validateCustomer(name, email);

	}

	@GetMapping("/customername/{name}") // http://localhost:8080/customerName/suresh
	public @ResponseBody List<CustomerEntity> getCustomerByName(@PathVariable("name") String name) {
		return customerService.getCustomerByName(name);
	}

	@PostMapping("/customer") // http://localhost:8080/customer
	public @ResponseBody ResponseStructure<CustomerEntity> saveCustomer(@RequestBody CustomerDTO dto) {
		return customerService.saveCustomer(dto);
	}

	@PutMapping("/customer")
	public @ResponseBody ResponseStructure<CustomerEntity> updateCustomer(@RequestBody CustomerEntity customerEntity) {
		return customerService.updateCustomer(customerEntity);

	}

	@GetMapping("/customer")
	public @ResponseBody ResponseStructure<List<CustomerEntity>> getAllCustomerData() {
		return customerService.getAllCustomerData();
	}

	@GetMapping("/customer/{id}")
	public @ResponseBody CustomerEntity getDataCustomerDataById(@PathVariable("id") int id) {
		return customerService.getCustomerDataById(id);

	}

}
