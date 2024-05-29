package com.example.thymeleafPro;

public class PersonDTO {
	private String id;
	private String pass;
	private String name;
	private int jumsu;
	public PersonDTO() {
		
	}
	public PersonDTO(String id, String pass, String name, int jumsu) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.jumsu = jumsu;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", pass=" + pass + ", name=" + name + ", jumsu=" + jumsu + "]";
	}
	
}
