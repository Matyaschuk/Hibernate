package com.academysmart.jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Airport {
	@Id
	private long airport_Id;
	private String airportName;
	@OneToMany(mappedBy = "airport")
	private List<Flight> flights;

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public long getId() {
		return airport_Id;
	}

	public void setId(long airport_Id) {
		this.airport_Id = airport_Id;
	}
}
