package studentMgn.Pnel;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import studentMgn.Dto.GradeConvertion;
import studentMgn.Dto.StudentManagement;

public class studentMgnBtn01Top extends JPanel {
	private JPanel pDayNight;
	private JLabel lblDayNight;
	private JComboBox<StudentManagement> cBDayNight;  //3.dto클래스 참조
	private JPanel pDept;
	private JLabel lblDept;
	private JComboBox<String> cBDept;   //1. String타입으로 받기로함
	private JComboBox<GradeConvertion> cBGrade;
	private JLabel cBStateName;
	private JPanel pStateName;
	private JComboBox<String> cBStateName_1;
	private JPanel pSelectBtn;
	private JButton btnSelectBtn;
	private JPanel pGrade;
	private JLabel lblGrade;   
	//2. db에서 데이터 가져오기  - 배열로 하는 방법도 있지만 ArrayList로 
	ArrayList<String> DayNightShift =  new ArrayList<>();
	ArrayList<String> GradeConvertion =  new ArrayList<>();
	

	public studentMgnBtn01Top() {

		initialize();
		
		
		
	}

	private void initialize() {
		setLayout(new GridLayout(0, 5, 0, 0));
		
		pDayNight = new JPanel();
		pDayNight.setBorder(new EmptyBorder(0, 20, 0, 20));
		add(pDayNight);
		pDayNight.setLayout(new GridLayout(0, 2, 20, 0));
		
		lblDayNight = new JLabel("주야구분");
		lblDayNight.setHorizontalAlignment(SwingConstants.CENTER);
		pDayNight.add(lblDayNight);
		
		cBDayNight = new JComboBox<>();
		pDayNight.add(cBDayNight);
		
		pDept = new JPanel();
		pDept.setBorder(new EmptyBorder(0, 20, 0, 20));
		add(pDept);
		pDept.setLayout(new GridLayout(0, 2, 20, 0));
		
		lblDept = new JLabel("학과");
		lblDept.setHorizontalAlignment(SwingConstants.CENTER);
		pDept.add(lblDept);
		
		cBDept = new JComboBox<>();
		pDept.add(cBDept);
		
		pGrade = new JPanel();
		pGrade.setBorder(new EmptyBorder(0, 20, 0, 20));
		add(pGrade);
		pGrade.setLayout(new GridLayout(0, 2, 20, 0));
		
		lblGrade = new JLabel("학년");
		lblGrade.setHorizontalAlignment(SwingConstants.CENTER);
		pGrade.add(lblGrade);
		
		cBGrade = new JComboBox<>();
		pGrade.add(cBGrade);
		
		pStateName = new JPanel();
		pStateName.setBorder(new EmptyBorder(0, 20, 0, 20));
		add(pStateName);
		pStateName.setLayout(new GridLayout(0, 2, 20, 0));
		
		cBStateName = new JLabel("학적구분");
		cBStateName.setHorizontalAlignment(SwingConstants.CENTER);
		pStateName.add(cBStateName);
		
		cBStateName_1 = new JComboBox<>();
		pStateName.add(cBStateName_1);
		
		pSelectBtn = new JPanel();
		pSelectBtn.setBorder(new EmptyBorder(0, 40, 0, 40));
		add(pSelectBtn);
		pSelectBtn.setLayout(new GridLayout(0, 1, 100, 0));
		
		btnSelectBtn = new JButton("조회");
		pSelectBtn.add(btnSelectBtn);
	}

}
