package kr.co.sist.cinema.admin.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kr.co.sist.cinema.admin.controller.SCAMainController;

@SuppressWarnings("serial")
public class SCAMainView extends JFrame {
	public static String version = "0.0.1-alpha";
	public static Color jtpColor = new Color(0xC8DDF2);
	
	private JButton jbtMovieManagement, jbtOnScreenManagement, jbtBookManagement, 
	                jbtMemberManagement, jbtCalculationManagement, jbtSnackManagement;
	
	public SCAMainView() {
		super("쌍용관 - 메인 화면");
		
		setTitle(getTitle() + "-" + version);
		
		// create btn
		jbtMovieManagement = new JButton(new ImageIcon(
				"C:/dev/workspace/cinema_prj/src/kr/co/sist/cinema/admin/images/admin_movie_management(145x220).png"));
		jbtMovieManagement.setBounds(0, 0, 145, 220);
		jbtMovieManagement.setContentAreaFilled(false);
		jbtMovieManagement.setOpaque(false);
		jbtMovieManagement.setFocusable(false);
		jbtMovieManagement.setFocusPainted(false);
		jbtMovieManagement.setBorderPainted(false);
		
		jbtOnScreenManagement = new JButton(new ImageIcon(
				"C:/dev/workspace/cinema_prj/src/kr/co/sist/cinema/admin/images/admin_onscreen_management(145x220).png"));
		jbtOnScreenManagement.setBounds(155, 0, 145, 220);
		
		jbtBookManagement = new JButton(new ImageIcon(
				"C:/dev/workspace/cinema_prj/src/kr/co/sist/cinema/admin/images/admin_book_management(145x220).png"));
		
		jbtMemberManagement = new JButton(new ImageIcon(
				"C:/dev/workspace/cinema_prj/src/kr/co/sist/cinema/admin/images/admin_onscreen_management(145x220).png"));
		
		jbtCalculationManagement = new JButton(new ImageIcon(
				"C:/dev/workspace/cinema_prj/src/kr/co/sist/cinema/admin/images/admin_calculation_management(145x220).png"));
		
		jbtSnackManagement = new JButton(new ImageIcon(
				"C:/dev/workspace/cinema_prj/src/kr/co/sist/cinema/admin/images/admin_snack_management(145x220).png"));
		
		JPanel jpEntry = new JPanel();
		jpEntry.setLayout(null);
//		jpEntry.setBackground(Color.WHITE);
		jpEntry.setBounds(100, 210, 800, 400);
		
		jpEntry.add(jbtMovieManagement);
		jpEntry.add(jbtOnScreenManagement);
		
		JLabel jlblBackground = new JLabel(new ImageIcon(
				"C:/dev/workspace/cinema_prj/src/kr/co/sist/cinema/admin/images/admin_bg(1000x800).png"));
		jlblBackground.setBounds(0, 0, 1000, 800);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		
		jp.add(jpEntry);
		jp.add(jlblBackground);
		
		add(jp);
		
		// 
		SCAMainController scamc = new SCAMainController(this);
		
		jbtMovieManagement.addActionListener(scamc);
		
		addWindowListener(scamc);
		
		setSize(1000, 820);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	} // SCAMainView

	public JButton getJbtMovieManagement() {
		return jbtMovieManagement;
	}

	public JButton getJbtOnScreenManagement() {
		return jbtOnScreenManagement;
	}

	public JButton getJbtBookManagement() {
		return jbtBookManagement;
	}

	public JButton getJbtMemberManagement() {
		return jbtMemberManagement;
	}

	public JButton getJbtCalculationManagement() {
		return jbtCalculationManagement;
	}

	public JButton getJbtSnackManagement() {
		return jbtSnackManagement;
	}
	
} // class
