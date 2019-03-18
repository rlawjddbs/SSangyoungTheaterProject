package kr.co.sist.cinema.admin.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import kr.co.sist.cinema.admin.view.SCAMainView;
import kr.co.sist.cinema.admin.view.SCAMovieManageView;


public class SCAMainController extends WindowAdapter implements ActionListener {
	private SCAMainView scamv;
	
	public SCAMainController(SCAMainView scamv) {
		this.scamv = scamv;
		
	} // SCAMainController
	
	@Override
	public void windowClosing(WindowEvent we) {
		scamv.dispose();
	} // windowClosing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == scamv.getJbtMovieManagement()) {
			new SCAMovieManageView();
		} // end if
	} // actionPerformed
	
} // class
