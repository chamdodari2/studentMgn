package studentMgn.Dao;  //학과 테이블

import java.util.List;

import studentMgn.Dto.StdState;
import studentMgn.Dto.StudentManagement;

public interface StudentMgnDao {
	
	//학적,학생관리 
	List<StudentManagement> selectStdNoStdNameStdStateByAll();  //아무것도 안넣고 조회 눌렀을때 (학번,성명,학적구분) 출력
	
	////일단 이거까지 테스트해보기
	
	
	
	StdState selectStudentByNo(StdState student);
	
	int insertStudent(StdState student);
	int updateStudent(StdState student);
	int deleteStudent(StdState studentNo);
	

}
