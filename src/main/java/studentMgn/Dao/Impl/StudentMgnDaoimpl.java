package studentMgn.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import studentMgn.Dao.StudentManagementDao;
import studentMgn.Dto.StdState;
import studentMgn.Dto.StudentManagement;
import studentMgn.util.JdbcUtil;

public class StudentMgnDaoimpl implements StudentManagementDao {
	
	private static final StudentMgnDaoimpl instanse = new StudentMgnDaoimpl();

	public static StudentMgnDaoimpl getInstance() {
		return instanse;
	}
	

	public StudentMgnDaoimpl() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public List<StudentManagement> selectStudentByAll() {
		String sql = "select stdNo ,stdName,stateName" + 
				" from studentManagement m join stdState s on m.stateCode =s.stateCode";
//		String sql = "select stdNo, stdName, stateCode from studentManagement";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {

			if (rs.next()) {
				List<StudentManagement> list = new ArrayList<>();
				do {
					list.add(getstudentManagement(rs));

				} while (rs.next());
				return list;
			}
			//예외처리
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private StudentManagement getstudentManagement(ResultSet rs) throws SQLException {
		//select stdNo ,stdName,stateName from studentManagement m join stdState s on m.stateCode =s.stateCode;
		// stdNo, stdName, deptCode, grade, stateCode, militaryCode, idNo, hpNo, dayNighShift  이거먼저 해보기!! 조인보다 먼저해봐야한당!!
		
		int stdNo = rs.getInt("stdNo");
		String stdName = rs.getString("stdName");
//		Department deptCode = new Department(rs.getString("deptCode"));
	//	int grade= rs.getInt("grade");
//		StdState stateCode = new StdState(rs.getString("stateCode")); // // //
		StdState stateName = new StdState (rs.getString("stateName"));
//		MilitaryState militaryCode = new MilitaryState(rs.getNString("militaryCode")); 
//		String idNo =rs.getNString("idNo");
//		String hpNo =rs.getString("hpNo");
//		String dayNighShift = rs.getNString("dayNighShift"); // 여기에도 주석풀고 다 적어주야함
		
		
		return new StudentManagement(stdNo, stdName,stateName);
	//			deptName,deptCode, grade, stdState, stdState, militaryCode, militaryCode, idNo, hpNo, dayNighShift, null, null);  // dto 필트를 통한 생성자에  있는 매개변수대로 다 넣어주기!!!!
	}


	@Override
	public StdState selectStudentByNo(StdState student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertStudent(StdState student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStudent(StdState student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent(StdState studentNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
