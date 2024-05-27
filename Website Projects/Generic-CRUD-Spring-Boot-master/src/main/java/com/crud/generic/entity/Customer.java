package com.crud.generic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.crud.generic.entity.baseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter

@Entity
@Table(name = "tbl_customer")
public class Customer extends BaseEntity{
	
	@Column(name = "email", nullable = false, length = 200)
	private String email;
	@Column(name = "password", nullable = false)
	private String password;
	@Column(name = "user_name", nullable = false)
	private String userName;

}
