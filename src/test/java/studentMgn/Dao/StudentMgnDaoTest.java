package studentMgn.Dao;  // html파일로 볼수있는 빌드파일 확인하기!!!! 제이유닛 테스트 해봥혀ㅑㅏㅁ!!!

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


import studentMgn.Dao.Impl.StudentMgnDaoimpl;
import studentMgn.Dto.StudentManagement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentMgnDaoTest {
	private static StudentManagementDao dao = StudentMgnDaoimpl.getInstance();

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test01SelectStudentByAll() {
		System.out.printf("%s()%n","test01SelectStudentByAll");
		List<StudentManagement> stdList = dao.selectStudentByAll();
		
		Assert.assertNotNull(stdList);
		for(StudentManagement s : stdList) {
			System.out.println(s);
			
			
			
			

			
			
		}
	}

}
