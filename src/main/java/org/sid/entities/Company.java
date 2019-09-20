package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double price;
	public Company() {
		super();
	}
	public Company(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
