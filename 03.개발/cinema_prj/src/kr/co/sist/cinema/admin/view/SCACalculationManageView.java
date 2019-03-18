package kr.co.sist.cinema.admin.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import kr.co.sist.cinema.admin.controller.SCACalculationManageController;

@SuppressWarnings("serial")
public class SCACalculationManageView extends JFrame {
	private JCheckBox jcbYear, jcbMonth, jcbDay;
	private JButton jbtCalculation, jbtClose;
	private DefaultTableModel dtmMovieSalesList, dtmSnackSalesList;
	private JTable jtabMovieSalesList, jtabSnackSalesList;
	private JTextField jtfMovieSales, jtfSnackSales, jtfTotalSales;
	
	public SCACalculationManageView() {
		super("정산 관리");
		
		SCACalculationManageController scacmc = new SCACalculationManageController(this);
		
		
		
		addWindowListener(scacmc);
		
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	} // SCACalculationManageView

	public JCheckBox getJcbYear() {
		return jcbYear;
	}

	public JCheckBox getJcbMonth() {
		return jcbMonth;
	}

	public JCheckBox getJcbDay() {
		return jcbDay;
	}

	public JButton getJbtCalculation() {
		return jbtCalculation;
	}

	public JButton getJbtClose() {
		return jbtClose;
	}

	public DefaultTableModel getDtmMovieSalesList() {
		return dtmMovieSalesList;
	}

	public DefaultTableModel getDtmSnackSalesList() {
		return dtmSnackSalesList;
	}

	public JTable getJtabMovieSalesList() {
		return jtabMovieSalesList;
	}

	public JTable getJtabSnackSalesList() {
		return jtabSnackSalesList;
	}

	public JTextField getJtfMovieSales() {
		return jtfMovieSales;
	}

	public JTextField getJtfSnackSales() {
		return jtfSnackSales;
	}

	public JTextField getJtfTotalSales() {
		return jtfTotalSales;
	}
	
} // class
