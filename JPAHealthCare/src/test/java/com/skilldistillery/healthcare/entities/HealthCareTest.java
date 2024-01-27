package com.skilldistillery.healthcare.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HealthCareTest {
	
		private static EntityManagerFactory emf;
		private EntityManager em;
		private HealthCare lang;
		
		
		
		@BeforeAll
		static void setUpBeforeClass() throws Exception {
		    emf = Persistence.createEntityManagerFactory("HealthCare");
		}

		@AfterAll
		static void tearDownAfterClass() throws Exception {
		    emf.close();
		}
		
		@BeforeEach
		void setUp() throws Exception {
		    em = emf.createEntityManager();
		    lang = em.find(HealthCare.class, 2);
		}

		@AfterEach
		void tearDown() throws Exception {
		   lang = null;
			em.close();
		}
		
		@Test
		void Customer_entity_mapping() {
			assertNotNull(lang);
			assertEquals("Biggins", lang.getPatientName());
			}
		
	}
