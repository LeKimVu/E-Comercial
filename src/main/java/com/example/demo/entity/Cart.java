package com.example.demo.entity;	

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	
	
	 @ManyToOne
	 @JoinColumn(name = "user_id")
	private User user;
	
	
}
