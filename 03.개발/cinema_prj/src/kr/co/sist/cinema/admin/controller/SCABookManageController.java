package kr.co.sist.cinema.admin.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import kr.co.sist.cinema.admin.view.SCABookManageView;

public class SCABookManageController extends WindowAdapter implements ActionListener {
	private SCABookManageView scabmv;
	
	public SCABookManageController(SCABookManageView scabmv) {
		this.scabmv = scabmv;
		
	} // SCABookManageController
	
	@Override
	public void windowClosing(WindowEvent we) {
		scabmv.dispose();
	} // windowClosing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
	} // actionPerformed
	
} // class
