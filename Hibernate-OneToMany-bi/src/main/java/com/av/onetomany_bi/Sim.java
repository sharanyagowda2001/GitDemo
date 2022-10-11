package com.av.onetomany_bi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String s_pro;
	private String type;
	
	@ManyToOne
	@JoinColumn
	
	Mobile m;
	
	
	public Mobile getM() {
		return m;
	}
	public void setM(Mobile m) {
		this.m = m;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getS_pro() {
		return s_pro;
	}
	public void setS_pro(String s_pro) {
		this.s_pro = s_pro;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
