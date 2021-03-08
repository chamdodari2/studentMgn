package studentMgn.Dto;

public class Department {
	private String deptCode;
	private String deptName;
	
	public Department(String deptCode, String deptName) {
		this.deptCode = deptCode;
		this.deptName = deptName;
	}
	
	public Department(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return String.format("Department [deptCode=%s, deptName=%s]", deptCode, deptName);
	}
	

}
