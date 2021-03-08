package studentMgn.Dto;

public class StdState  implements Comparable<StdState>{ //기본정렬을 학번으로 한다는뜻 

	private int stateCode; // 학적코드
	private String stateName; // 학적구분
	
	@Override
	public int compareTo(StdState o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

	public StdState(int stateCode, String stateName) {
		this.stateCode = stateCode;
		this.stateName = stateName;
	}




	




	public StdState(String string) {
		// TODO Auto-generated constructor stub
	}




	public int getStateCode() {
		return stateCode;
	}


	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	@Override
	public String toString() {
		return String.format("StdState [stateCode=%s, stateName=%s]", stateCode, stateName);
	}
	
	
	


}
