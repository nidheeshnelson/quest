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
}
