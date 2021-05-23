package entities;

import java.time.LocalDate;

import abstracts.Entity;

public class Customer implements Entity{
	private int id;
	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String nationlityId;
	
	public Customer(int id, String name, String surname, LocalDate dateOfBirth, String nationlityId) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.nationlityId = nationlityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationlityId() {
		return nationlityId;
	}

	public void setNationlityId(String nationlityId) {
		this.nationlityId = nationlityId;
	}


	
}
