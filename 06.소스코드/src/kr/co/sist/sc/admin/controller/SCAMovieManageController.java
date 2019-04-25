package kr.co.sist.sc.admin.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import kr.co.sist.sc.admin.view.SCAMovieDetailsView;
import kr.co.sist.sc.admin.view.SCAMovieManageView;

public class SCAMovieManageController extends WindowAdapter implements ActionListener {

	private SCAMovieManageView scammv;

	public SCAMovieManageController(SCAMovieManageView scammv) {
		this.scammv = scammv;
	} // SCAMovieManageController

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		// ��ȭ ��� ��ư�� Ŭ���� ���
		if(ae.getSource() == scammv.getJbtMovieInsert()) {
			new SCAMovieDetailsView(scammv);
		} // end if
		
		// �ݱ� ��ư�� Ŭ���� ���
		if(ae.getSource() == scammv.getJbtClose()) {
			System.out.println("�ݱ� ��ư ����");
		} // end if
		
	} // actionPerformed

} // class
