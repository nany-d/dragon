package com.qa.dragons;

public class Dragon {

	private String name;
	private int age;
	private int scariness;

	public Dragon(String name, int age, int scariness) {
		super();
		this.name = name;
		this.age = age;
		this.scariness = scariness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCuteness() {
		return scariness;
	}

	public void setScariness(int scariness) {
		this.scariness = scariness;
	}

	@Override
	public String toString() {
		return "Kitten [name=" + name + ", age=" + age + ", scariness=" + scariness + "]";
	}

}
