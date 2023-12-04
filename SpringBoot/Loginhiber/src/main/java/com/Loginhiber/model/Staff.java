package com.Loginhiber.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="staff_data")
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	@Column(name="user_name", unique = true)
private String user;
	@Column(unique = true)
private String password;
	@Column(name="full_name")
private String name;
private int age;
private String place;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
}
