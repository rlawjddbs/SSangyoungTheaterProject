package kr.co.sist.cinema.admin.view;

import javax.swing.JButton;
import javax.swing.JDialog;

import kr.co.sist.cinema.admin.controller.SCABookStandardScreenController;
import kr.co.sist.cinema.admin.vo.SCABookOnScreenVO;

/**
 * 예매 관리 - 일반 좌석 뷰
 * @author owner
 */
@SuppressWarnings("serial")
public class SCABookStandardScreenView extends JDialog {
	private JButton[][] jbtSeat;
	private JButton jbtSelect, jbtClose;
	private SCABookOnScreenVO scabos_vo;
	
	public SCABookStandardScreenView(SCABookManageView scabmv, SCABookOnScreenVO scabos_vo) {
		super(scabmv, "예매 관리 - 좌석 선택", true);
		
		this.scabos_vo = scabos_vo;

		jbtSeat = new JButton[4][5];
		
		
		
		// 
		SCABookStandardScreenController scabssc = new SCABookStandardScreenController(this);
		
		addWindowListener(scabssc);
		
		setSize(500, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	} // SCABookStandardScreenView

	public JButton[][] getJbtSeat() {
		return jbtSeat;
	}

	public JButton getJbtSelect() {
		return jbtSelect;
	}

	public JButton getJbtClose() {
		return jbtClose;
	}

	public SCABookOnScreenVO getScabos_vo() {
		return scabos_vo;
	}
	
} // class
