package com.api_life.webflux.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Items {
	
	public Items(String id, int sequence, String code, String description, Double amount, String commercial_unit,
			Double unitary_value, Double value, String date, String marketplace) {
		super();
		this.id = id;
		this.sequence = sequence;
		this.code = code;
		this.description = description;
		this.amount = amount;
		this.commercial_unit = commercial_unit;
		this.unitary_value = unitary_value;
		this.value = value;
		this.date = date;
		this.marketplace = marketplace;
	}
		
	@Id
	private String id;
	private int sequence;
	private String code;
	private String description;
	private Double amount; 
	private String commercial_unit;
	private Double unitary_value;
	private Double value;
	private String date;
	private String marketplace;
	
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public String getCommercial_unit() {
		return commercial_unit;
	}
	public void setCommercial_unit(String commercial_unit) {
		this.commercial_unit = commercial_unit;
	}
	public Double getUnitary_value() {
		return unitary_value;
	}
	public void setUnitary_value(Double unitary_value) {
		this.unitary_value = unitary_value;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMarketplace() {
		return marketplace;
	}
	public void setMarketplace(String marketplace) {
		this.marketplace = marketplace;
	}

}
