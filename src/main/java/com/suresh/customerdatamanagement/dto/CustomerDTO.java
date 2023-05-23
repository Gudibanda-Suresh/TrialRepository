package com.suresh.customerdatamanagement.dto;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.suresh.customerdatamanagement.entity.CustomerEntity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDTO implements Serializable {

	private Integer id;

	private String name;

	private String email;

	public CustomerDTO(CustomerEntity customerEntity) {
		this.id = customerEntity.getId();
		this.name = customerEntity.getName();
		this.email = customerEntity.getEmail();
	}
}
