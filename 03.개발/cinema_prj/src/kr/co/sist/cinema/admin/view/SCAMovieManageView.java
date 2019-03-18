package kr.co.sist.cinema.admin.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import kr.co.sist.cinema.admin.controller.SCAMovieManageController;

@SuppressWarnings("serial")
public class SCAMovieManageView extends JFrame {
	private DefaultTableModel dtmMovieList;
	private JTable jtabMovieList;
	private JButton jbtMovieInsert;
	
	public SCAMovieManageView() {
		super("쌍용관 - 영화 관리");
		
		jbtMovieInsert = new JButton("영화 등록");
		jbtMovieInsert.setBounds(0, 0, 80, 40);
		
		//
		JPanel jpSelect = new JPanel();
		jpSelect.setLayout(null);
		jpSelect.setBackground(Color.WHITE);
		jpSelect.setBounds(200, 200, 400, 400);
		
//		jpSelect.add(jbtMovieManagement);
		
//		JLabel jlblBackground = new JLabel(new ImageIcon(
//				"C:/dev/workspace/cinema_prj/src/kr/co/sist/cinema/admin/images/admin_main.png"));
//		jlblBackground.setBounds(0, 0, 1000, 800);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.LIGHT_GRAY);
		
//		jp.add(jpSelect);
//		jp.add(jlblBackground);
		
		add(jp);
		
		//
		SCAMovieManageController scammc = new SCAMovieManageController(this);
		
		jbtMovieInsert.addActionListener(scammc);
		
		addWindowListener(scammc);
		
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	} // SCAMovieManageView

	public DefaultTableModel getDtmMovieList() {
		return dtmMovieList;
	}

	public JTable getJtabMovieList() {
		return jtabMovieList;
	}

	public JButton getJbtMovieInsert() {
		return jbtMovieInsert;
	}

} // class
