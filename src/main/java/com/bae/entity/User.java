package com.bae.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

@Entity
@Table(name = "Users")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int memberId;

	private JsonNode details;

	public User() {

	}

	public User(int id, String name, int memberId) {
		this.id = id;
		this.name = name;
		this.memberId = memberId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMemberId() {
		return memberId;
	}

}
