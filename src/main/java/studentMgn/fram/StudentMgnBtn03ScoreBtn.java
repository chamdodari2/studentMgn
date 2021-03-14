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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import studentMgn.Panel.StudentMgnBtn03ScoreBtnCenter;

public class StudentMgnBtn03ScoreBtn extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;

	public StudentMgnBtn03ScoreBtn() {
		initialize();
	}
	private void initialize() {
		setTitle("성적수정");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 400, 722, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pTop = new JPanel();
		contentPane.add(pTop, BorderLayout.NORTH);
		pTop.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("성적 수정");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pTop.add(lblNewLabel);
		
		StudentMgnBtn03ScoreBtnCenter pCenter = new StudentMgnBtn03ScoreBtnCenter();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pBtnHome = new JPanel();
		contentPane.add(pBtnHome, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("저장");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 25));
		pBtnHome.add(btnNewButton);
		
		JButton button = new JButton("취소");
		button.setFont(new Font("굴림", Font.BOLD, 25));
		pBtnHome.add(button);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
}
