package com.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Null;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Developer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String surName;
	private String phoneNumber;
	private String email;
	private Boolean isInternalMember;
	private Date startedDate;
	@JsonIgnore
	@ManyToMany(fetch=FetchType.LAZY)
	private List<ProgrammingLanguage> languages = new ArrayList<>();

	public Developer() {
		super();
	}
	

	public Developer(Long id) {
		super();
		this.id = id;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setsurName(String surName) {
		this.surName = surName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getemail() {
		return email;
	}

	public Boolean getisInternalMember() {
		return isInternalMember;
	}

	public void setisInternalMember(Boolean isInternalMember) {
		this.isInternalMember = isInternalMember;
	}

	public List<ProgrammingLanguage> getLanguages() {
		return languages;
	}

	public void setLanguages(List<ProgrammingLanguage> languages) {
		this.languages = languages;
	}

}
