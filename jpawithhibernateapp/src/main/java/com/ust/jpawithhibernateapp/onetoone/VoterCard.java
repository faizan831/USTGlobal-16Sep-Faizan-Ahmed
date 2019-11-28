package com.ust.jpawithhibernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name="voterCard")
public class VoterCard {
	@Id
	@Column
	private int vid;
	
	@Column
	private String vname;
	
	@Exclude //toString method 
	@OneToOne(mappedBy = "voterCard")
	private Person person;
	
}
