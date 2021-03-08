package studentMgn.Dto;

public class StudentScore {
	private int stdNo;
	private int subject1;
	private int subject2;
	private int subject3;
	
	
	public StudentScore(int stdNo, int subject1, int subject2, int subject3) {
		this.stdNo = stdNo;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}


	public StudentScore(int stdNo) {
		this.stdNo = stdNo;
	}


	public StudentScore(int stdNo, int subject1) {
		this.stdNo = stdNo;
		this.subject1 = subject1;
	}


	public StudentScore(int stdNo, int subject1, int subject2) {
		this.stdNo = stdNo;
		this.subject1 = subject1;
		this.subject2 = subject2;
	}


	public int getStdNo() {
		return stdNo;
	}


	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}


	public int getSubject1() {
		return subject1;
	}


	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}


	public int getSubject2() {
		return subject2;
	}


	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}


	public int getSubject3() {
		return subject3;
	}


	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}


	@Override
	public String toString() {
		return String.format("StudentScore [stdNo=%s, subject1=%s, subject2=%s, subject3=%s]", stdNo, subject1,
				subject2, subject3);
	}
	

}
