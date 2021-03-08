package studentMgn.fram;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import studentMgn.Pnel.studentMgnBtn01Left;
import studentMgn.Pnel.studentMgnBtn01Top;

public class StudentMgnBtn01 extends JFrame {

	private JPanel contentPane;

	public StudentMgnBtn01() {
		initialize();
	}
	private void initialize() {
		setTitle("학적/학생관리");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 100, 966, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pTop = new JPanel();
		contentPane.add(pTop, BorderLayout.NORTH);
		pTop.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = new JLabel("학적/학생관리");
		lblTitle.setVerticalAlignment(SwingConstants.TOP);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("굴림", Font.BOLD, 35));
		pTop.add(lblTitle);
		
		studentMgnBtn01Top pSelect = new studentMgnBtn01Top();
		pTop.add(pSelect, BorderLayout.SOUTH);
		
		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pLeftList = new JPanel();
		pCenter.add(pLeftList);
		
		JPanel pRightList = new JPanel();
		pCenter.add(pRightList);
	}

}
