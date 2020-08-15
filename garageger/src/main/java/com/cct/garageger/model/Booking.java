package com.cct.garageger.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

//This class will be identify a entity, each variable represents a field in the database


@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String service;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	private String phone;
	private String type;
	private String license;
	private String engine;
	private String make;
	private String make_other;
	private String status;
	private String description_problem;
	private double total_price;
	private double service_price_item;
	private String comments;
	
	 		
	public Booking() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake_other() {
		return make_other;
	}

	public void setMake_other(String make_other) {
		this.make_other = make_other;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription_problem() {
		return description_problem;
	}

	public void setDescription_problem(String description_problem) {
		this.description_problem = description_problem;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public double getService_price_item() {
		return service_price_item;
	}

	public void setService_price_item(double service_price_item) {
		this.service_price_item = service_price_item;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	
	

}
