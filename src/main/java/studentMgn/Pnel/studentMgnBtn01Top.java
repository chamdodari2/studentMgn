package studentMgn.Pnel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class studentMgnBtn01Top extends JPanel {

	/**
	 * Create the panel.
	 */
	public studentMgnBtn01Top() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel pDN = new JPanel();
		pDN.setBorder(new EmptyBorder(0, 20, 0, 20));
		add(pDN);
		pDN.setLayout(new GridLayout(0, 2, 20, 0));
		
		JLabel lblDN = new JLabel("주야구분");
		lblDN.setHorizontalAlignment(SwingConstants.CENTER);
		pDN.add(lblDN);
		
		JComboBox cB01 = new JComboBox();
		pDN.add(cB01);
		
		JPanel pDept = new JPanel();
		pDept.setBorder(new EmptyBorder(0, 20, 0, 20));
		add(pDept);
		pDept.setLayout(new GridLayout(0, 2, 20, 0));
		
		JLabel lblDept = new JLabel("학과");
		lblDept.setHorizontalAlignment(SwingConstants.CENTER);
		pDept.add(lblDept);
		
		JComboBox cB02 = new JComboBox();
		pDept.add(cB02);
		
		JPanel pGrade = new JPanel();
		pGrade.setBorder(new EmptyBorder(0, 20, 0, 20));
		add(pGrade);
		pGrade.setLayout(new GridLayout(0, 2, 20, 0));
		
		JLabel lblGrade = new JLabel("학년");
		lblGrade.setHorizontalAlignment(SwingConstants.CENTER);
		pGrade.add(lblGrade);
		
		JComboBox cB03 = new JComboBox();
		pGrade.add(cB03);
		
		JPanel pState = new JPanel();
		pState.setBorder(new EmptyBorder(0, 20, 0, 20));
		add(pState);
		pState.setLayout(new GridLayout(0, 2, 20, 0));
		
		JLabel cB04 = new JLabel("학적구분");
		cB04.setHorizontalAlignment(SwingConstants.CENTER);
		pState.add(cB04);
		
		JComboBox comboBox_3 = new JComboBox();
		pState.add(comboBox_3);
		
		JPanel pSelect = new JPanel();
		pSelect.setBorder(new EmptyBorder(0, 40, 0, 40));
		add(pSelect);
		pSelect.setLayout(new GridLayout(0, 1, 100, 0));
		
		JButton btnNewButton = new JButton("조회");
		pSelect.add(btnNewButton);
	}

}
