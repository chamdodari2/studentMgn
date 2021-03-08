package studentMgn.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import studentMgn.Dao.StudentMgnDao;
import studentMgn.Dto.Department;
import studentMgn.Dto.MilitaryState;
import studentMgn.Dto.StdState;
import studentMgn.Dto.studentManagement;

public class StudentMgnDaoimpl implements StudentMgnDao {
	
	private static final StudentMgnDaoimpl instanse = new StudentMgnDaoimpl();

	public static StudentMgnDaoimpl getInstance() {
		return instanse;
	}
	

	public StudentMgnDaoimpl() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public List<studentManagement> selectStdNoStdNameStdStateByAll() {
		String sql = "select stdNo, stdName, deptCode, grade, stateCode, militaryCode, idNo, hpNo, dayNighShift"
				+ " from studentManagement";
		try (Connection con = studentMgn.util.JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {

			if (rs.next()) {
				List<studentManagement> list = new ArrayList<>();
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

	private studentManagement getstudentManagement(ResultSet rs) throws SQLException {
		// stdNo, stdName, deptCode, grade, stateCode, militaryCode, idNo, hpNo, dayNighShift  이거먼저 해보기!! 조인보다 먼저해봐야한당!!
		int stdNo = rs.getInt("stdNo");
		String stdName = rs.getString("stdName");
		Department deptCode = new Department(rs.getString("deptCode"));
		int grade= rs.getInt("grade");
		StdState stdState = new StdState(rs.getString("stateCode"));
		MilitaryState militaryCode = new MilitaryState(rs.getNString("militaryCode")); 
		String idNo =rs.getNString("idNo");
		String hpNo =rs.getString("hpNo");
		String dayNighShift = rs.getNString("dayNighShift"); // 여기에도 주석풀고 다 적어주야함
		
		
		return new studentManagement(stdNo, stdName, deptCode, grade, stdState, militaryCode, idNo, hpNo, dayNighShift);  // dto 필트를 통한 생성자에  있는 매개변수대로 다 넣어주기!!!!
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
