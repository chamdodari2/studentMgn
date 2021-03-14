package studentMgn.fram;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import studentMgn.Panel.StudentMgnBtn02Left;
import studentMgn.Panel.StudentMgnBtn02Right;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class StudentMgnBtn02 extends JFrame {

	private JPanel contentPane;

	public StudentMgnBtn02() {
		initialize();
	}
	private void initialize() {
		setTitle("학생 조회");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 400, 722, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pTop = new JPanel();
		contentPane.add(pTop, BorderLayout.NORTH);
		pTop.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("학생 조회");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pTop.add(lblNewLabel);
		
		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new GridLayout(0, 2, 0, 0));
		
		StudentMgnBtn02Left pLeftList = new StudentMgnBtn02Left();///이거 수정하기
		pCenter.add(pLeftList);
		
		StudentMgnBtn02Right pRighList = new StudentMgnBtn02Right();
		pCenter.add(pRighList);
		
		JPanel pBtnHome = new JPanel();
		contentPane.add(pBtnHome, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 25));
		pBtnHome.add(btnNewButton);
	}

}
