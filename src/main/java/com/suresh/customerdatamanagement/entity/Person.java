package com.suresh.customerdatamanagement.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Person implements Serializable //prevents data connection while trasfering the data
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "person")
	private List<BankAccountEntity> accounts;
	
	
	
	

}
