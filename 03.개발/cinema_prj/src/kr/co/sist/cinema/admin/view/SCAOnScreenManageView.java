package kr.co.sist.cinema.admin.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SCAOnScreenManageView extends JFrame {
	private JComboBox<String> jcbMovieSelectUp, jcbTheaterSelect, jcbMovieSelectDown, 
	                  jcbYearUp, jcbMonthUp, jcbDayUp, jcbHour, jcbMinute, jcbYearDown, jcbMonthDown, jcbDayDown;
	private JButton jbtOnScreenInsert, jbtOnScreenSelect, jbtOnScreenDelete, jbtClose;
	
	public SCAOnScreenManageView() {
		super("상영 관리");
		
		
		
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	} // SCAOnScreenManageView
	
} // class
