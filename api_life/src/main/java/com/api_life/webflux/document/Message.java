package com.api_life.webflux.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Message {
	
	
	public Message(String id, String date_time, String chat_id, String first_name, String last_name,
			String type_botinho, String type_message, String text) {
		super();
		this.id = id;
		this.date_time = date_time;
		this.chat_id = chat_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.type_botinho = type_botinho;
		this.type_message = type_message;
		this.text = text;
	}
	
	
	@Id
	private String id;
	private String date_time;
	private String chat_id;
	private String first_name;
	private String last_name; 
	private String type_botinho;
	private String type_message;
	private String text;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate_time() {
		return date_time;
	}
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	public String getChat_id() {
		return chat_id;
	}
	public void setChat_id(String chat_id) {
		this.chat_id = chat_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getType_botinho() {
		return type_botinho;
	}
	public void setType_botinho(String type_botinho) {
		this.type_botinho = type_botinho;
	}
	public String getType_message() {
		return type_message;
	}
	public void setType_message(String type_message) {
		this.type_message = type_message;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

    
}
