package org.arpit.java2blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name="COUNTRY")
public class Country{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="countryname")
	String countryname;
	
	@Column(name="countrycode")
	int countrycode;
	
	@Column(name="countrylan")
	String countrylan;
	
	@Column(name="countrypop")
	long countrypop;
	
	@Column(name="countrysepc")
	String countrysepc;
	
	@Column(name="countrynationalplay")
	String countrynationalplay;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public int getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}
	public String getCountrylan() {
		return countrylan;
	}
	public void setCountrylan(String countrylan) {
		this.countrylan = countrylan;
	}
	public long getCountrypop() {
		return countrypop;
	}
	public void setCountrypop(long countrypop) {
		this.countrypop = countrypop;
	}
	public String getCountrysepc() {
		return countrysepc;
	}
	public void setCountrysepc(String countrysepc) {
		this.countrysepc = countrysepc;
	}
	public String getCountrynationalplay() {
		return countrynationalplay;
	}
	public void setCountrynationalplay(String countrynationalplay) {
		this.countrynationalplay = countrynationalplay;
	}
	
	
	
}