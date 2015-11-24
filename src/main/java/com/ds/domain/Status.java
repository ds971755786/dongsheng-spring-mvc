package com.ds.domain;

import java.util.GregorianCalendar;

public class Status {
	private Long id;
	private String version;
	private GregorianCalendar time;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public GregorianCalendar getTime() {
		return time;
	}
	public void setTime(GregorianCalendar time) {
		this.time = time;
	}
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}
	private Character character;
}
