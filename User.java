package com.Subha.ineuron.q22.Q22.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String username;
	
	@OneToOne(cascade = CascadeType.ALL)
	private purchace purchase;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String username, purchace purchase) {
		super();
		this.id = id;
		this.username = username;
		this.purchase = purchase;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public purchace getPurchase() {
		return purchase;
	}

	public void setPurchase(purchace purchase) {
		this.purchase = purchase;
	}
	
	
	
}
