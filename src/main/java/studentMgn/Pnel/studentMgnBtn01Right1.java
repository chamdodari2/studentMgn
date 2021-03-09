package studentMgn.Pnel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class studentMgnBtn01Right1 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the panel.
	 */
	public studentMgnBtn01Right1() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("▼상세 정보");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel);
		
		JPanel pCenter = new JPanel();
		add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setVgap(20);
		flowLayout_1.setHgap(20);
		pCenter.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("주야");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("학과");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setVgap(20);
		flowLayout_2.setHgap(20);
		pCenter.add(panel_2);
		
		JLabel label = new JLabel("학년");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		panel_2.add(textField_2);
		
		JLabel label_1 = new JLabel("성명");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		panel_2.add(textField_3);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_3.getLayout();
		flowLayout_3.setVgap(20);
		flowLayout_3.setHgap(20);
		pCenter.add(panel_3);
		
		JLabel label_2 = new JLabel("학번");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_2);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		panel_3.add(textField_4);
		
		JLabel label_3 = new JLabel("학적");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		panel_3.add(textField_5);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_4.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		flowLayout_4.setVgap(20);
		flowLayout_4.setHgap(50);
		pCenter.add(panel_4);
		
		JLabel label_4 = new JLabel("생년월일");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(label_4);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setColumns(20);
		panel_4.add(textField_6);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_5.getLayout();
		flowLayout_5.setVgap(20);
		flowLayout_5.setHgap(20);
		pCenter.add(panel_5);
		
		JLabel label_5 = new JLabel("성별");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(label_5);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		panel_5.add(textField_7);
		
		JLabel label_6 = new JLabel("병역");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(label_6);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		panel_5.add(textField_8);
	}

}
