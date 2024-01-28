package com.skilldistillery.healthcare.controllers.data;

import com.skilldistillery.healthcare.entities.HealthCare;

public interface HealthCareDAO {

	public HealthCare findById(int id);
	
	public HealthCare createHealthCare(HealthCare health);
	
	public boolean deleteHealthCare(HealthCare health);
	
	public HealthCare updateHealthCare(HealthCare health);
}
