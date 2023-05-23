package com.suresh.customerdatamanagement.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.suresh.customerdatamanagement.dto.CustomerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok installer
//projectlombok.org
//cmd : java -jar lombok.jar
//

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cutomer_info")
public class CustomerEntity implements Serializable // converting data from byte stream(secure for to use Serializable)
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String email;

	public CustomerEntity(CustomerDTO dto) {
		this.id = dto.getId();
		this.name = dto.getName();
		this.email = dto.getEmail();
	}

}
