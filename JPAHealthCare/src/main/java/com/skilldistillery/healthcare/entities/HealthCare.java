package com.skilldistillery.healthcare.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "health_care")
public class HealthCare {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "patient_name")
	private String patientName;

	@Column(name = "medical_records")
	private String medicalRecords;

	@Column(name = "healthcare_providers")
	private String healthcareProviders;

	private LocalDateTime appointments;

	private String prescriptions;

	public HealthCare() {
	}

	public String getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(String medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

	public String getHealthcareProviders() {
		return healthcareProviders;
	}

	public void setHealthcareProviders(String healthcareProviders) {
		this.healthcareProviders = healthcareProviders;
	}

	public LocalDateTime getAppointments() {
		return appointments;
	}

	public void setAppointments(LocalDateTime appointments) {
		this.appointments = appointments;
	}

	public String getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(String prescriptions) {
		this.prescriptions = prescriptions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HealthCare other = (HealthCare) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "HealthCare [id=" + id + ", patientName=" + patientName + ", medicalRecords=" + medicalRecords
				+ ", healthcareProviders=" + healthcareProviders + ", appointments=" + appointments + ", prescriptions="
				+ prescriptions + "]";
	}

}
