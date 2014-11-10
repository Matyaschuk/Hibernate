package com.academysmart.jpa.model;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UkrAviaTest {
	private static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("derbyTest");
	private EntityManager em;
	private EntityTransaction tx;

	@Before
	public void setUp() throws Exception {
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@After
	public void tearDown() throws Exception {
		if (em != null) {
			em.clear();
		}
	}

	@Test
	public void showFindTicket() throws Exception {
		Ticket ticket = em.find(Ticket.class, 1L);
		assertEquals(1, ticket.getId());
	}

	@Test
	public void showFindAirport() throws Exception {
		Airport airport = em.find(Airport.class, 1L);
		assertEquals("BORISPOL", airport.getAirportName());
	}

	@Test
	public void showFlightTitle() {
		Ticket ticket = em.find(Ticket.class, 2L);
		System.out.println(ticket.getFlight().getFlightTitle());
		assertEquals(2, ticket.getId());
	}

	@Test
	public void showPhone() {
		Ticket ticket = em.find(Ticket.class, 2L);
		System.out.println(ticket.getPassenger().getPhone());
		assertEquals(2, ticket.getId());
	}
	@Test
	public void shouldCreatePassenger() {
		Passenger passenger = new Passenger();
		passenger.setPassId(12);
		passenger.setName("GLEB");
		passenger.setSurname("GLEBOV");
		passenger.setPatronymic("GLEBOVICH");
		passenger.setPhone("54718778894");
		tx.begin();
		em.persist(passenger);
		tx.commit();
		passenger = em.find(Passenger.class, 12L);
		System.out.println(passenger.getSurname());
		assertEquals("GLEBOV", passenger.getSurname());
	}

	@Test
	public void shouldRemovePassenger() {
		Passenger passenger = em.find(Passenger.class, 2L);
		tx.begin();
		em.remove(passenger);
		tx.commit();
		@SuppressWarnings("unchecked")
		List<Passenger> passengers = em.createNamedQuery("selectAll")
				.getResultList();
		assertEquals(2, passengers.size());
	}
}