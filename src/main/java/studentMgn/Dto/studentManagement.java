package studentMgn.Dto;

public class studentManagement {
	private int stdNo;
	private String stdName;
	private Department deptCode;
	private int grade;
	private StdState stateCode;
	private MilitaryState militaryCode;
	private String idNo;
	private String hpNo;
	private String dayNighShift;
	
	
	public studentManagement(int stdNo, String stdName, Department deptCode, int grade, StdState stateCode,
			MilitaryState militaryCode, String idNo, String hpNo, String dayNighShift) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.deptCode = deptCode;
		this.grade = grade;
		this.stateCode = stateCode;
		this.militaryCode = militaryCode;
		this.idNo = idNo;
		this.hpNo = hpNo;
		this.dayNighShift = dayNighShift;
	}

		public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Department getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(Department deptCode) {
		this.deptCode = deptCode;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public StdState getStateCode() {
		return stateCode;
	}

	public void setStateCode(StdState stateCode) {
		this.stateCode = stateCode;
	}

	public MilitaryState getMilitaryCode() {
		return militaryCode;
	}

	public void setMilitaryCode(MilitaryState militaryCode) {
		this.militaryCode = militaryCode;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getHpNo() {
		return hpNo;
	}

	public void setHpNo(String hpNo) {
		this.hpNo = hpNo;
	}

	public String getDayNighShift() {
		return dayNighShift;
	}

	public void setDayNighShift(String dayNighShift) {
		this.dayNighShift = dayNighShift;
	}

	@Override
	public String toString() {
		return String.format(
				"studentManagement [stdNo=%s, stdName=%s, deptCode=%s, grade=%s, stateCode=%s, militaryCode=%s, idNo=%s, hpNo=%s, dayNighShift=%s]",
				stdNo, stdName, deptCode, grade, stateCode, militaryCode, idNo, hpNo, dayNighShift);
	}

	
}
