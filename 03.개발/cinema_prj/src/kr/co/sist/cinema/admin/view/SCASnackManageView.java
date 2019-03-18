package kr.co.sist.cinema.admin.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import kr.co.sist.cinema.admin.controller.SCASnackManageController;

@SuppressWarnings("serial")
public class SCASnackManageView extends JFrame {
	private JButton[][] jbtSnackImg;
	private JButton jbtSnackMenuInsert, jbtSnackPayment, jbtSnackOrderDelete, jbtClose;
	private DefaultTableModel dtmOrderList;
	private JTable jtabOrderList;
	
	public SCASnackManageView() {
		super("½º³¼ °ü¸®");
		
		jbtSnackImg = new JButton[2][4];
		
		
		
		SCASnackManageController scasmc = new SCASnackManageController(this);
		
		
		
		addWindowListener(scasmc);
		
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	} // SCASnackManageView

	public JButton[][] getJbtSnackImg() {
		return jbtSnackImg;
	}

	public JButton getJbtSnackMenuInsert() {
		return jbtSnackMenuInsert;
	}

	public JButton getJbtSnackPayment() {
		return jbtSnackPayment;
	}

	public JButton getJbtSnackOrderDelete() {
		return jbtSnackOrderDelete;
	}

	public JButton getJbtClose() {
		return jbtClose;
	}

	public DefaultTableModel getDtmOrderList() {
		return dtmOrderList;
	}

	public JTable getJtabOrderList() {
		return jtabOrderList;
	}
	
} // class
