package com.skilldistillery.healthcare.controllers.data;

import org.springframework.stereotype.Service;

import com.skilldistillery.healthcare.entities.HealthCare;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class HealthCareDAOImpl implements HealthCareDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public HealthCare findById(int id) {
		HealthCare health = em.find(HealthCare.class, id);
		return health;
	}

}
