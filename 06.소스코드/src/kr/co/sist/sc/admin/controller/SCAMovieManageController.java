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
		
		// 영화 등록 버튼을 클릭한 경우
		if(ae.getSource() == scammv.getJbtMovieInsert()) {
			new SCAMovieDetailsView(scammv);
		} // end if
		
		// 닫기 버튼을 클릭한 경우
		if(ae.getSource() == scammv.getJbtClose()) {
			System.out.println("닫기 버튼 눌림");
		} // end if
		
	} // actionPerformed

} // class
