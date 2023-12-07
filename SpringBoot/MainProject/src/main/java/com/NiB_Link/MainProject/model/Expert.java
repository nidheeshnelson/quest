package com.NiB_Link.MainProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Eperts")
public class Expert {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sl_no;
	private String name;
	private int age;
	private String dob;
	private String email;
	private String phone;
	private String gender;
	private String field;
	private String id_type;
	private String id_number;
	private String p_country;
	private String p_state;
	private String p_district;
	private String p_taluk;
	private String p_localbody;
	private String p_postoffice;
	private String p_place;
	private String country;
	private String state;
	private String district;
	private String taluk;
	private String localbody;
	private String postoffice;
	private String place;
	public int getSl_no() {
		return sl_no;
	}
	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getId_type() {
		return id_type;
	}
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getP_country() {
		return p_country;
	}
	public void setP_country(String p_country) {
		this.p_country = p_country;
	}
	public String getP_state() {
		return p_state;
	}
	public void setP_state(String p_state) {
		this.p_state = p_state;
	}
	public String getP_district() {
		return p_district;
	}
	public void setP_district(String p_district) {
		this.p_district = p_district;
	}
	public String getP_taluk() {
		return p_taluk;
	}
	public void setP_taluk(String p_taluk) {
		this.p_taluk = p_taluk;
	}
	public String getP_localbody() {
		return p_localbody;
	}
	public void setP_localbody(String p_localbody) {
		this.p_localbody = p_localbody;
	}
	public String getP_postoffice() {
		return p_postoffice;
	}
	public void setP_postoffice(String p_postoffice) {
		this.p_postoffice = p_postoffice;
	}
	public String getP_place() {
		return p_place;
	}
	public void setP_place(String p_place) {
		this.p_place = p_place;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTaluk() {
		return taluk;
	}
	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}
	public String getLocalbody() {
		return localbody;
	}
	public void setLocalbody(String localbody) {
		this.localbody = localbody;
	}
	public String getPostoffice() {
		return postoffice;
	}
	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
}
