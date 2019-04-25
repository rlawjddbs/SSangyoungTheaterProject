package kr.co.sist.sc.admin.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import kr.co.sist.sc.admin.controller.SCAMainController;

public class SCAMainView extends JFrame {

	private JButton jbtMovieManagement, jbtScreeningManagement, jbtTicketingManagement, jbtMemberManagement,
						jbtCalcManagement, jbtSnackManagement;
	
	public SCAMainView(String id, String adminName) {
		super("������ ���� - "+id);
		setLayout(null);
		
		// ��� �̹����� ���� JLabel
		JLabel jlBg = new JLabel();
		jlBg.setSize(1000, 800);
		jlBg.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_main_bg(1000x800).png"));
		
		// ������ ���̵�� �̸��� �ԷµǴ� JLabel
		JLabel jlId = new JLabel("id - "+id);
		JLabel jlAdminName = new JLabel("name - "+adminName);
		
		
		jlId.setBounds(800, 20, 100, 30);
		jlId.setFont(new Font("�����ٸ����", Font.BOLD, 20));
		jlId.setForeground(Color.WHITE);
		
		jlAdminName.setBounds(800, 50, 150, 30);
		jlAdminName.setFont(new Font("�����ٸ����", Font.BOLD, 20));
		jlAdminName.setForeground(Color.WHITE);
		
		
		// JButton
		jbtMovieManagement = new JButton();
		jbtScreeningManagement = new JButton();
		jbtTicketingManagement = new JButton();
		jbtMemberManagement = new JButton();
		jbtCalcManagement = new JButton();
		jbtSnackManagement = new JButton();
		
		// JButton ũ��, ��ǥ, ������ ����
		jbtMovieManagement.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_movie_management(145x220).png"));
		jbtMovieManagement.setBounds(20, 300, 145, 220);
		jbtScreeningManagement.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_screening_management(145x220).png"));
		jbtScreeningManagement.setBounds(180, 300, 145, 220);
		jbtTicketingManagement.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_ticketing_management(145x220).png"));
		jbtTicketingManagement.setBounds(340, 300, 145, 220);
		jbtMemberManagement.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_member_management(145x220).png"));
		jbtMemberManagement.setBounds(500, 300, 145, 220);
		jbtCalcManagement.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_calc_management(145x220).png"));
		jbtCalcManagement.setBounds(660, 300, 145, 220);
		jbtSnackManagement.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_snack_management(145x220).png"));
		jbtSnackManagement.setBounds(820, 300, 145, 220);
		
		// JButton ���� �׵θ� ����
		jbtMovieManagement.setContentAreaFilled(false);
		jbtMovieManagement.setBorderPainted(false);
		jbtScreeningManagement.setContentAreaFilled(false);
		jbtScreeningManagement.setBorderPainted(false);
		jbtTicketingManagement.setContentAreaFilled(false);
		jbtTicketingManagement.setBorderPainted(false);
		jbtMemberManagement.setContentAreaFilled(false);
		jbtMemberManagement.setBorderPainted(false);
		jbtCalcManagement.setContentAreaFilled(false);
		jbtCalcManagement.setBorderPainted(false);
		jbtSnackManagement.setContentAreaFilled(false);
		jbtSnackManagement.setBorderPainted(false);
		
		// ������� ���� �󺧿� ������Ʈ ��� ����
		jlBg.add(jlId);
		jlBg.add(jlAdminName);
		jlBg.add(jbtMovieManagement);
		jlBg.add(jbtScreeningManagement);
		jlBg.add(jbtTicketingManagement);
		jlBg.add(jbtMemberManagement);
		jlBg.add(jbtCalcManagement);
		jlBg.add(jbtSnackManagement);
		// ���̾�α׿� JLabel ����
		add(jlBg);
		
		// �̺�Ʈ ó��
		SCAMainController scamc = new SCAMainController(this);
		addWindowListener(scamc);
		jbtSnackManagement.addActionListener(scamc);
		jbtSnackManagement.addMouseListener(scamc);
		jbtMemberManagement.addActionListener(scamc);
		jbtMemberManagement.addMouseListener(scamc);
		
		// ���̾�α� ũ��, ��ġ ����, ����ȭ
		setBounds(500,100,1000,800);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
	} // SCAMainView

	public JButton getJbtMovieManagement() {
		return jbtMovieManagement;
	} 

	public JButton getJbtScreeningManagement() {
		return jbtScreeningManagement;
	}

	public JButton getJbtTicketingManagement() {
		return jbtTicketingManagement;
	}

	public JButton getJbtMemberManagement() {
		return jbtMemberManagement;
	}

	public JButton getJbtCalcManagement() {
		return jbtCalcManagement;
	}

	public JButton getJbtSnackManagement() {
		return jbtSnackManagement;
	}
	
	
	
} // class
