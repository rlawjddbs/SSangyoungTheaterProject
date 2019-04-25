package kr.co.sist.sc.admin.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import kr.co.sist.sc.admin.model.SCALoginDAO;
import kr.co.sist.sc.admin.view.SCALoginView;
import kr.co.sist.sc.admin.view.SCAMainView;
import kr.co.sist.sc.admin.vo.SCALoginCheckVO;
import kr.co.sist.sc.admin.vo.SCALoginVO;

public class SCALoginController extends WindowAdapter implements ActionListener{

	private SCALoginView scalv;
	
	public SCALoginController(SCALoginView scalv) {
		this.scalv = scalv;
	} // SCALoginController

	@Override
	public void actionPerformed(ActionEvent ae) {
		String id = scalv.getJtfId().getText();
		String passwd = new String(scalv.getJpfPasswd().getPassword());

		if(ae.getSource() == scalv.getJtfId()) {
			if(id.equals("")) {
				scalv.getJtfId().requestFocus();
			} else {
				scalv.getJpfPasswd().requestFocus();
			} // end else
		} // end if
		
		if(ae.getSource() == scalv.getJpfPasswd()) {
			if(passwd.equals("")) {
				scalv.getJpfPasswd().requestFocus();
			} else {
				loginCheck(id, passwd);
			} // end else
		} // end if
		
		if(ae.getSource() == scalv.getJbtLogin()) {
			
			
			if(id.equals("")) {
				JOptionPane.showMessageDialog(scalv, "���̵� �Է��ϼ���.");
				scalv.getJtfId().requestFocus();
				return;
			} // end if

			if(passwd.equals("")) {
				JOptionPane.showMessageDialog(scalv, "��й�ȣ�� �Է��ϼ���.");
				scalv.getJpfPasswd().requestFocus();
				return;
			} // end if
			
			loginCheck(id, passwd);
			
		} // end if
	} // actionPerformed
	
	@Override
	public void windowClosing(WindowEvent we) {
		scalv.dispose();
	} // windowClosing

	private void loginCheck(String id, String passwd) {
		SCALoginCheckVO scalcvo = new SCALoginCheckVO(id, passwd);
		
		try {
			SCALoginVO scalvo = SCALoginDAO.getInstance().loginAdmin(scalcvo);
			
			if(!scalvo.getName().equals("")) {
				JOptionPane.showMessageDialog(scalv, "�ݰ����ϴ�. ["+scalvo.getName()+"]��.");
				new SCAMainView(scalvo.getAdmin_id(), scalvo.getName());
				scalv.dispose();
			} // end if
		} catch (SQLException sqle) {
			JOptionPane.showMessageDialog(scalv, "���̵�� ��й�ȣ�� Ȯ���� �ּ���.");
		} // end try
		
		
	} // loginCheck
	
} // class
