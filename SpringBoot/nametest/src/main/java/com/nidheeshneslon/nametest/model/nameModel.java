package com.nidheeshneslon.nametest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="name_list")
public class nameModel {
@Id
@GeneratedValue
private int id;
@NotBlank(message = "The Name is required")
private String name;
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
@Override
public String toString() {
	return "nameModel [id=" + id + ", name=" + name + "]";
}
}
