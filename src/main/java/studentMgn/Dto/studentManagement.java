package studentMgn.Dto;

import java.util.List;

public class studentManagement {  //////여기에 점수도 들어가있어야한다!!!! 한꺼번에 3과목이어야하니까 배열이나 리스트로 받아오기!!!!!!!!!!!!!!
	private int stdNo; //학번
	private String stdName; //이름
	private Department deptCode;  //학과코드
	private int grade;  //학년
	private StdState stateCode;  //학적코드(재학 등)	
	private MilitaryState militaryCode; //병역코드(미필 등)
	private String idNo;	//주민번호
	private String hpNo;	//휴대폰번호
	private String dayNighShift;	//주야구분
//수정중
	private  List<StudentScore> studentScore;  //성적
//end	
	
	
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
