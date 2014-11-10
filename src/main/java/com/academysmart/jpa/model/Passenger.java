package com.academysmart.jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@NamedQuery(name = "selectAll", query = "SELECT p FROM Passenger p")
public class Passenger {
	@Id
	
	private long pass_Id;
	private String name;
	private String surname;
	private String patronymic;
	private String phone;
	@OneToMany(mappedBy = "passenger")
	@Cascade(value = { CascadeType.ALL })
	private List<Ticket> tickets;

	public long getPassId() {
		return pass_Id;
	}

	public void setPassId(long pass_Id) {
		this.pass_Id = pass_Id;
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

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Passenger() {
	}
}