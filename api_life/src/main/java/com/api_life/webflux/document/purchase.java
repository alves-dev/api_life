package com.api_life.webflux.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class purchase {
	
		
	public purchase(String id, String date, Double value, String code, String type, String description, Double amount,
			String establishment) {
		super();
		this.id = id;
		this.date = date;
		this.value = value;
		this.code = code;
		this.type = type;
		this.description = description;
		this.amount = amount;
		this.establishment = establishment;
	}
	
	@Id
	private String id;
	private String date;
	private Double value;
	private String code;
	private String type;
	private String description;
	private Double amount;
	private String establishment;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getEstablishment() {
		return establishment;
	}
	public void setEstablishment(String establishment) {
		this.establishment = establishment;
	}
	
}
