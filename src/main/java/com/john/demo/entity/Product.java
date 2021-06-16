package com.john.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_TBL")
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int prie;

	public Product() {
		super();
	}

	public Product(int id, String name, int prie) {
		super();
		this.id = id;
		this.name = name;
		this.prie = prie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrie() {
		return prie;
	}

	public void setPrie(int prie) {
		this.prie = prie;
	}
}
