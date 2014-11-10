package com.academysmart.jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Flight {
	@Id
	
	private long flight_Id;
	private String flightTitle;
	private String departure;
	private String destination;
	private String flightType;
	private int classNumber;
	private int seatNumber;
	@OneToMany(mappedBy = "flight")
	private List<Ticket> tickets;
	@ManyToOne
	@JoinColumn(name = "AIRPORT_ID", referencedColumnName = "AIRPORT_ID")
	private Airport airport;

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public String getFlightTitle() {
		return flightTitle;
	}

	public void setFlightTitle(String flightTitle) {
		this.flightTitle = flightTitle;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public long getFlight_Id() {
		return flight_Id;
	}

	public void setFlight_Id(long flight_Id) {
		this.flight_Id = flight_Id;
	}

	public Flight() {
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}
}