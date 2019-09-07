package com.cg.hcs.dto;

import java.util.List;

public class DiagnosticCenter<T> {
	private String centerName;
	private T centerId;
	private List<Test> listOfTests;
	private List<Appointment> listOfAppointments;
	
	public DiagnosticCenter()
	{
		
	}
	
	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public T getCenterId() {
		return centerId;
	}

	public void setCenterId(T centerId) {
		this.centerId = centerId;
	}

	public List<Test> getListOfTests() {
		return listOfTests;
	}

	public void setListOfTests(List<Test> listOfTests) {
		this.listOfTests = listOfTests;
	}

	public List<Appointment> getListOfAppointments() {
		return listOfAppointments;
	}

	public void setListOfAppointments(List<Appointment> listOfAppointments) {
		this.listOfAppointments = listOfAppointments;
	}

	public DiagnosticCenter(String centerName, T centerId, List<Test> listOfTests,
			List<Appointment> listOfAppointments) {
		super();
		this.centerName = centerName;
		this.centerId = centerId;
		this.listOfTests = listOfTests;
		this.listOfAppointments = listOfAppointments;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centerId == null) ? 0 : centerId.hashCode());
		result = prime * result + ((centerName == null) ? 0 : centerName.hashCode());
		result = prime * result + ((listOfAppointments == null) ? 0 : listOfAppointments.hashCode());
		result = prime * result + ((listOfTests == null) ? 0 : listOfTests.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiagnosticCenter other = (DiagnosticCenter) obj;
		if (centerId == null) {
			if (other.centerId != null)
				return false;
		} else if (!centerId.equals(other.centerId))
			return false;
		if (centerName == null) {
			if (other.centerName != null)
				return false;
		} else if (!centerName.equals(other.centerName))
			return false;
		if (listOfAppointments == null) {
			if (other.listOfAppointments != null)
				return false;
		} else if (!listOfAppointments.equals(other.listOfAppointments))
			return false;
		if (listOfTests == null) {
			if (other.listOfTests != null)
				return false;
		} else if (!listOfTests.equals(other.listOfTests))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DiagnosticCenter [centerName=" + centerName + ", centerId=" + centerId + ", listOfTests=" + listOfTests
				+ ", listOfAppointments=" + listOfAppointments + "]";
	}

	
}
