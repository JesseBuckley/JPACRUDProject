package com.skilldistillery.healthcare.controllers.data;

import com.skilldistillery.healthcare.entities.HealthCare;

public interface HealthCareDAO {

	public HealthCare findById(int id);
}
