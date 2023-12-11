package com.nidheeshnelson.niblink.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="expert_registration")
public class NibLinkExpertRegistration {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

}
