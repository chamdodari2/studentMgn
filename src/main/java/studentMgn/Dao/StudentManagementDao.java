package studentMgn.Dao;  //학과 테이블

import java.util.List;

import studentMgn.Dto.StdState;
import studentMgn.Dto.StudentManagement;

public interface StudentManagementDao {
	
	//학적,학생관리 
	 //아무것도 안넣고 조회 눌렀을때 (학번,성명,학적구분) 출력
	List<StudentManagement> selectStdNoStdNameStdStateByAll(); 
	
	
	/*1.해당 조건에 맞는 목록 출력, 전체도 있게
	 * 
	 * */
	
	
	////일단 이거까지 테스트해보기
	
	
	
	StdState selectStudentByNo(StdState student);
	
	int insertStudent(StdState student);
	int updateStudent(StdState student);
	int deleteStudent(StdState studentNo);
	

}
