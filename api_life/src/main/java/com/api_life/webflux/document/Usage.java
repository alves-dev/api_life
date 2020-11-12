package com.api_life.webflux.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usage {
	
	
	public Usage(String id, String date, int minutes, int checks) {
		super();
		this.id = id;
		this.date = date;
		this.minutes = minutes;
		this.checks = checks;
	}
	
	
	@Id
	private String id;
	private String date;
	private int minutes;
	private int checks;
	
	
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
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getChecks() {
		return checks;
	}
	public void setChecks(int checks) {
		this.checks = checks;
	}
	
	
}
