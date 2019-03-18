package kr.co.sist.cinema.admin.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import kr.co.sist.cinema.admin.controller.SCAMemberManageController;

@SuppressWarnings("serial")
public class SCAMemberManageView extends JFrame {
	private JButton jbtMemberSelectAll, jbtMemberSelect, jbtClose;
	private JTextField jtfMemberId;
	private DefaultTableModel dtmMemberList;
	private JTable jtabMemberList;
	
	public SCAMemberManageView() {
		super("회원 관리");
		
		SCAMemberManageController scammc = new SCAMemberManageController(this);
		
		addWindowListener(scammc);
		
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	} // SCAMemberManageView

	public JButton getJbtMemberSelectAll() {
		return jbtMemberSelectAll;
	}

	public JButton getJbtMemberSelect() {
		return jbtMemberSelect;
	}

	public JButton getJbtClose() {
		return jbtClose;
	}

	public JTextField getJtfMemberId() {
		return jtfMemberId;
	}

	public DefaultTableModel getDtmMemberList() {
		return dtmMemberList;
	}

	public JTable getJtabMemberList() {
		return jtabMemberList;
	}
	
} // class
