package com.suresh.customerdatamanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class BankAccountEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="p_id")
	private int pId;
	
	private String name;
	@Column(name="account_number")
	private Long accountNumber;
	
	@ManyToOne
	@JoinColumn
	private Person person;
	
	

}
