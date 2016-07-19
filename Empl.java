package com.niit.shoppingcart;

public class Empl {
	
	private int id;
	
	private String name;
	
	private int salary;
	
	private Empl manager;

	private Department dept;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Empl getManager() {
		return manager;
	}

	public void setManager(Empl manager) {
		this.manager = manager;
	}


}
