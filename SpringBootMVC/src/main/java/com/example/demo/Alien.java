package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	
	private int id;
	private String aname;
	private String tech;
	
	@Autowired
	private Laptop laptop;
	
	public Alien() {	
		
		super();
		System.out.println("Object Created");
	}
	
	@Override
	public String toString() {
		return "Alien [id=" + id + ", aname=" + aname + ", tech=" + tech + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show() {
		System.out.println("in show");
		laptop.compile();
	}
	
	
	

}
