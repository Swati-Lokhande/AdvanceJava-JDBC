package com.qsp.student_app;

public class StudentData {

	private int id;
	private String name;
	private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public StudentData(int id1, String updateName) {
		super();
		this.id=id1;
		this.name=updateName;
		
	}
	public StudentData(int id, String name, String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	public StudentData() {
		// TODO Auto-gthis.id=id1;
	}
	public StudentData(int id2) {
		// TODO Auto-generated constructor stub
		this.id=id2;
	}
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
}
