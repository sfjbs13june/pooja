package com.pooja.rabbitmq.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Patient.class)
public class Patient {

	private String patientName;
	private String patientId;


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public String getPatientId() {
		return patientId;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientId=" + patientId + "]";
	}
}
