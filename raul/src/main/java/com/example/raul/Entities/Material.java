package com.example.raul.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import org.springframework.data.annotation.Id;

public class Material implements Serializable{
	
	private static final long serialVersionUID = 7873892837928731L;
	
	@Id
	@Column(name="CODE")
	private int code;
	
	private String name;
	
	private float price;
	
	private String provider;
	
	private Date last_buy;
	
	public Material(int code, String name, float price, String provider, Date last_buy) {
		super();
		this.code = code;
		this.name = name;
		this.price  = price;
		this.provider  = provider;
		this.last_buy  = last_buy;
	}
	
	@Override
	public String toString() {
	return "Material [code=" + code + ", name=" + 
			name + ", price=" + price + ", provider=" + provider + ", last_buy" + last_buy + "]";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getProvider() {
		return provider;
	}
	
	public void setProvider(String provider) {
		this.provider = provider;
	}

	public Date getLast_buy() {
		return last_buy;
	}

	public void setLast_buy(Date last_buy) {
		this.last_buy = last_buy;
	}
	
}
