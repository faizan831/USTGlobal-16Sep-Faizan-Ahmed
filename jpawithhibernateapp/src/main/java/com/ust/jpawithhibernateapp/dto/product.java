package com.ust.jpawithhibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  // to make class as Entity class
@Table(name="Product")

public class product {
	@Id  // to make id as primary key
	@Column
	private int pid;
	
	@Column
	private String pname;
	
	@Column
	private int quality;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	

}
