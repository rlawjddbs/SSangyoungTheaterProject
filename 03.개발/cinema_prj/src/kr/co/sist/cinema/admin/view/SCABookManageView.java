package kr.co.sist.cinema.admin.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import kr.co.sist.cinema.admin.controller.SCABookManageController;

@SuppressWarnings("serial")
public class SCABookManageView extends JFrame {
	private JCheckBox jcbMovieTitle, jcbYear, jcbMonth, jcbDay, jcbPersonnel;
	private JButton jbtSearch, jbtBook, jbtClose;
	private DefaultTableModel dtmOnScreenList, dtmBookList;
	private JTable jtabOnScreenList, jtabBookList;
	
	public SCABookManageView() {
		super("쌍용관 - 예매 관리");
		
		
		
		SCABookManageController scabmc = new SCABookManageController(this);
		
		addWindowListener(scabmc);
		
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	} // SCABookManageView

	public JCheckBox getJcbMovieTitle() {
		return jcbMovieTitle;
	}

	public JCheckBox getJcbYear() {
		return jcbYear;
	}

	public JCheckBox getJcbMonth() {
		return jcbMonth;
	}

	public JCheckBox getJcbDay() {
		return jcbDay;
	}

	public JCheckBox getJcbPersonnel() {
		return jcbPersonnel;
	}

	public JButton getJbtSearch() {
		return jbtSearch;
	}

	public JButton getJbtBook() {
		return jbtBook;
	}

	public JButton getJbtClose() {
		return jbtClose;
	}

	public DefaultTableModel getDtmOnScreenList() {
		return dtmOnScreenList;
	}

	public DefaultTableModel getDtmBookList() {
		return dtmBookList;
	}

	public JTable getJtabOnScreenList() {
		return jtabOnScreenList;
	}

	public JTable getJtabBookList() {
		return jtabBookList;
	}
	
} // class
