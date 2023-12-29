package com.crud.todo.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todo list")
public class ListModel {
	@Id
private String id;
	@DateTimeFormat
private String dateandtime;
private String matter;
private int status;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDateandtime() {
	return dateandtime;
}
public void setDateandtime(String dateandtime) {
	this.dateandtime = dateandtime;
}
public String getMatter() {
	return matter;
}
public void setMatter(String matter) {
	this.matter = matter;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
@Override
public String toString() {
	return "ListModel [id=" + id + ", dateandtime=" + dateandtime + ", matter=" + matter + ", status=" + status + "]";
}

}
