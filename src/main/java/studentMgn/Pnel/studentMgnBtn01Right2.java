package studentMgn.Pnel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class studentMgnBtn01Right2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public studentMgnBtn01Right2() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(10);
		add(panel_1);
		
		JButton btnNewButton = new JButton("추가");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("저장");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("삭제");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Home");
		panel_1.add(btnNewButton_3);
	}

}
