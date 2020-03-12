package com.example.entity;

import javax.persistence.Entity;

@Entity
public class UserEntity {

	private String city;
	
	private String home_currency;
	
	private String travel_date;
	
	private String amount;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHome_currency() {
		return home_currency;
	}

	public void setHome_currency(String home_currency) {
		this.home_currency = home_currency;
	}

	public String getTravel_date() {
		return travel_date;
	}

	public void setTravel_date(String travel_date) {
		this.travel_date = travel_date;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}