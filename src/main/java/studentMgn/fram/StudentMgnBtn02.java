package studentMgn.fram;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import studentMgn.Pnel.studentMgnBtn02Right;

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
		
		studentMgnBtn02Right pLeftList = new studentMgnBtn02Right();///이거 수정하기
		pCenter.add(pLeftList);
		
		JPanel pRighList = new JPanel();
		pCenter.add(pRighList);
	}

}
