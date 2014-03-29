package main;

import java.util.Date;

public class TestResult {
	
	private int studentID;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public int getTestScore() {
		return testScore;
	}
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}
	private Date testDate;
	private int testScore;
	
	public TestResult(int sID, int tDate, int tScore) {
		// TODO Auto-generated constructor stub
		setStudentID(sID);
		setTestDate(testDate);
		setTestScore(tScore);

	}

}
