package com.cg.hcs.dto;

public class Test{
	private static Integer testCounter=0;
	private static final String prefix="Test";
	private String testId;
	private String testName;
	
	public Test()
	{	
	}

	Test(String testName) {
		super();
		this.testName = testName;
		testCounter++;
		setTestId(prefix + testCounter.toString());
	}
	
	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}


	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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