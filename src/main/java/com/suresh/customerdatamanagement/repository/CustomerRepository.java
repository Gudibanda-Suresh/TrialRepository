package com.suresh.customerdatamanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.suresh.customerdatamanagement.entity.CustomerEntity;

//java persistance api(Jpa)
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> 
{

	public List<CustomerEntity> findByName(String name);
	
	@Query("SELECT c from CustomerEntity c where c.name=:name AND  c.email=:email")
	List<CustomerEntity> validateCustomer(@Param("name") String name,@Param("email") String email);
	
	
	


}
