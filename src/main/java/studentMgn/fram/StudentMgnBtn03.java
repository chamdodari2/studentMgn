package studentMgn.fram;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class StudentMgnBtn03 extends JFrame {

	private JPanel contentPane;
	private JTable tblList;

	public StudentMgnBtn03() {
		initialize();
	}
	private void initialize() {
		setTitle("학생 조회");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 400, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pTop = new JPanel();
		contentPane.add(pTop, BorderLayout.NORTH);
		pTop.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTItle = new JLabel("성적관리");
		lblTItle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTItle.setFont(new Font("굴림", Font.BOLD, 35));
		pTop.add(lblTItle);
		
		JPanel pSelect = new JPanel();
		pTop.add(pSelect, BorderLayout.SOUTH);
		
		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new GridLayout(0, 1, 0, 0));
		
		tblList = new JTable();
		tblList.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"학과", "이름", "학번", "과목", "1과목성적", "2과목성적", "3과목성적", "총점", "평균", "평어","평점"
			}
		));
		tblList.setBorder(new EmptyBorder(0, 0, 0, 0));
		pCenter.add(tblList);
	}

}
