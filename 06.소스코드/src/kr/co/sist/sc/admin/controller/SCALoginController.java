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
				JOptionPane.showMessageDialog(scalv, "아이디를 입력하세요.");
				scalv.getJtfId().requestFocus();
				return;
			} // end if

			if(passwd.equals("")) {
				JOptionPane.showMessageDialog(scalv, "비밀번호를 입력하세요.");
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
				JOptionPane.showMessageDialog(scalv, "반갑습니다. ["+scalvo.getName()+"]님.");
				new SCAMainView(scalvo.getAdmin_id(), scalvo.getName());
				scalv.dispose();
			} // end if
		} catch (SQLException sqle) {
			JOptionPane.showMessageDialog(scalv, "아이디와 비밀번호를 확인해 주세요.");
		} // end try
		
		
	} // loginCheck
	
} // class
