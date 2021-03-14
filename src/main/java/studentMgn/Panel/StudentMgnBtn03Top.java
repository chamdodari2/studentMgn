package studentMgn.Panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;

public class StudentMgnBtn03Top extends JPanel {

	/**
	 * Create the panel.
	 */
	public StudentMgnBtn03Top() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(40);
		flowLayout.setVgap(15);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("성적 수정");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setHgap(40);
		add(panel_1);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setVgap(15);
		flowLayout_2.setHgap(20);
		add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("학과");
		panel_2.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		panel_2.add(comboBox_1);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_3.getLayout();
		flowLayout_3.setVgap(15);
		flowLayout_3.setHgap(20);
		add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("학년");
		panel_3.add(lblNewLabel_3);
		
		JComboBox comboBox_2 = new JComboBox();
		panel_3.add(comboBox_2);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_4.getLayout();
		flowLayout_4.setVgap(15);
		flowLayout_4.setHgap(20);
		add(panel_4);
		
		JLabel label = new JLabel("조회");
		panel_4.add(label);
		
		JComboBox comboBox = new JComboBox();
		panel_4.add(comboBox);
	}

}
