package studentMgn.Dao;  //학과 테이블

import java.util.List;

import studentMgn.Dto.StdState;
import studentMgn.Dto.studentManagement;

public interface StudentMgnDao {
	
	//학적,학생관리 
	List<studentManagement> selectStdNoStdNameStdStateByAll();  //아무것도 안넣고 조회 눌렀을때 (학번,성명,학적구분) 출력
	
	
	
	
	
	StdState selectStudentByNo(StdState student);
	
	int insertStudent(StdState student);
	int updateStudent(StdState student);
	int deleteStudent(StdState studentNo);
	

}
