package gameProject.entities.concretes;

import gameProject.entities.abstracts.Entity;

public class Gamer implements Entity {
	private int id;
	private String nameSurname;
	private int birthYear;
	private String identityNumber;

	public Gamer() {

	}

	public Gamer(int id, String nameSurname, int birthYear, String identityNumber) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
		this.birthYear = birthYear;
		this.identityNumber = identityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

}