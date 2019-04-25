package kr.co.sist.sc.admin.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;

import kr.co.sist.sc.admin.view.SCAMainView;
import kr.co.sist.sc.admin.view.SCAMemberManageView;
import kr.co.sist.sc.admin.view.SCASnackManageView;


public class SCAMainController extends WindowAdapter implements ActionListener, MouseListener {

	private SCAMainView scamv;
	
	public SCAMainController(SCAMainView scamv) {
		this.scamv = scamv;
	} // SCAMainController

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == scamv.getJbtMemberManagement()) {
			new SCAMemberManageView(scamv);
		} // end if
		
		if(ae.getSource() == scamv.getJbtSnackManagement()) {
			new SCASnackManageView(scamv);
		} // end if
	} // actionPerformed
	
	@Override
	public void windowClosing(WindowEvent we) {
		scamv.dispose();
	} // windowClosing
	
	@Override
	public void windowClosed(WindowEvent we) {
		System.exit(1);
	} // windowClosed
	
	@Override
	public void mouseClicked(MouseEvent me) {
		
	}
	@Override
	public void mousePressed(MouseEvent me) {
		if(me.getSource() == scamv.getJbtSnackManagement()) {
			scamv.getJbtSnackManagement().setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_snack_management_pressed(145x220).png"));
		} // end if
		if(me.getSource() == scamv.getJbtMemberManagement()) {
			scamv.getJbtMemberManagement().setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_member_management_pressed(145x220).png"));
		} // end if
	}
	@Override
	public void mouseReleased(MouseEvent me) {
		if(me.getSource() == scamv.getJbtSnackManagement()) {
			scamv.getJbtSnackManagement().setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_snack_management(145x220).png"));
		} // end if
		if(me.getSource() == scamv.getJbtMemberManagement()) {
			scamv.getJbtMemberManagement().setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_member_management(145x220).png"));
		} // end if
	}
	
	//////////////// not used /////////////////////////
	@Override
	public void mouseEntered(MouseEvent me) {
	}
	@Override
	public void mouseExited(MouseEvent me) {
	}

	
	
} // class
