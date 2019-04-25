package kr.co.sist.sc.admin.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import kr.co.sist.sc.admin.controller.SCAMovieManageController;

public class SCAMovieManageView extends JDialog {
	private DefaultTableModel dtmMovieList;
	private JTable jtabMovieList;
	private JButton jbtMovieInsert, jbtClose;
	
	public SCAMovieManageView() {
		super();
		
		setSize(390, 600);
		setLayout(null);
		
		JLabel jlDialogTitle = new JLabel("¿µÈ­°ü¸®");
		jlDialogTitle.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 24));
		jlDialogTitle.setForeground(new Color(255, 255, 255));
		jlDialogTitle.setBounds(30, 30, 100, 30);
		
		jbtMovieInsert = new JButton();
		jbtMovieInsert.setBounds(60, 480, 125, 40);
		jbtMovieInsert.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/jbt_resist(125x40).png"));
		jbtMovieInsert.setBorderPainted(false);
		jbtMovieInsert.setOpaque(false);
		jbtMovieInsert.setContentAreaFilled(false);
		
		jbtClose = new JButton();
		jbtClose.setBounds(195, 480, 125, 40);
		jbtClose.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/jbt_close(125x40).png"));
		jbtClose.setBorderPainted(false);
		jbtClose.setOpaque(false);
		jbtClose.setContentAreaFilled(false);
		
		JLabel jlBg = new JLabel();
		jlBg.setBounds(0, 0, 390, 600);
		jlBg.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_movie_management_bg(390x600).png"));
		jlBg.add(jlDialogTitle);
		jlBg.add(jbtMovieInsert);
		jlBg.add(jbtClose);
		
		
		add(jlBg);

		SCAMovieManageController scammc = new SCAMovieManageController(this);
		jbtMovieInsert.addActionListener(scammc);
		jbtClose.addActionListener(scammc);
		
		
		
		setLocation(100, 100);
		setVisible(true);
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
	}
	public DefaultTableModel getDtmMovieList() {
		return dtmMovieList;
	}
	public JTable getJtabMovieList() {
		return jtabMovieList;
	}
	public JButton getJbtMovieInsert() {
		return jbtMovieInsert;
	}
	public JButton getJbtClose() {
		return jbtClose;
	}
	
	public static void main(String[] args) {
		new SCAMovieManageView();
	}
	
}
