package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="user")
@Embeddable
public class Employee {
	public Employee() {}

	@Id
	@Column(name="Id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	 @Column(name="Fname")
	private String Fname;
	 @Column(name="Lname")
	private String Lname;
	 @Column(name="email")
	private String email;

	public int getId() {
		return id;
	}
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	@Column(name="Uname")
	private String Uname;
	 @Column(name="pass")
	private String pass;
   
}
