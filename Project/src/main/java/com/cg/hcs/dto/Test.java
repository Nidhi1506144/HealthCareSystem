package com.cg.hcs.dto;

public class Test<T>{
	private T testId;
	private String testName;
	private DiagnosticCenter center;
	
	public Test()
	{
		
	}

	Test(T testId, String testName, DiagnosticCenter center) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.center = center;
	}
	
	public T getTestId() {
		return testId;
	}

	public void setTestId(T testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public DiagnosticCenter getCenter() {
		return center;
	}

	public void setCenter(DiagnosticCenter center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", center=" + center + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((testId == null) ? 0 : testId.hashCode());
		result = prime * result + ((testName == null) ? 0 : testName.hashCode());
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
		Test other = (Test) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (testId == null) {
			if (other.testId != null)
				return false;
		} else if (!testId.equals(other.testId))
			return false;
		if (testName == null) {
			if (other.testName != null)
				return false;
		} else if (!testName.equals(other.testName))
			return false;
		return true;
	}
	
	
	
}