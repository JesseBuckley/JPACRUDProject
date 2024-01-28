package com.skilldistillery.healthcare.controllers.data;

import org.springframework.stereotype.Service;

import com.skilldistillery.healthcare.entities.HealthCare;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class HealthCareDAOImpl implements HealthCareDAO {

//	static {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	@PersistenceContext
	private EntityManager em;

	@Override
	public HealthCare findById(int id) {
		HealthCare health = em.find(HealthCare.class, id);
		return health;
	}

	@Override
	public HealthCare createHealthCare(HealthCare health) {

		em.persist(health);

		return health;
	}

	@Override
	public boolean deleteHealthCare(HealthCare health) {

		try {
			em.remove(health);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public HealthCare updateHealthCare(HealthCare health) {
		System.out.println("*************************DAO methods update**********************");
		
		em.merge(health);
		em.flush();
		return health;
		}

	}

