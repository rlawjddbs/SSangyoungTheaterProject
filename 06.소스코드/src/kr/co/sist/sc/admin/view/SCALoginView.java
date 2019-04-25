package kr.co.sist.sc.admin.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kr.co.sist.sc.admin.controller.SCALoginController;

public class SCALoginView extends JFrame {

	private JTextField jtfId;
	private JPasswordField jpfPasswd;
	private JButton jbtLogin;
	
	public SCALoginView() {
		// ������ ���̾ƿ� null
		setLayout(null);
		
		// ��� �̹��� ���� �� ����, ������ ����, ��ġ
		JLabel jlBg = new JLabel();
		jlBg.setBounds(0, 0, 300, 500);
		jlBg.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_login_bg(300x500).png"));
		
		// ������Ʈ ����
		jtfId = new JTextField();
		jpfPasswd = new JPasswordField();
		jbtLogin = new JButton();

		// JTF(���̵�) ������ ���ֱ�, ��Ʈ ����
		jtfId.setBounds(67, 150, 166, 30);
		jtfId.setOpaque(false);
		jtfId.setFont(new Font("�����ٸ����", Font.BOLD, 20));
		jtfId.setForeground(Color.WHITE);
		
		// JPF(��й�ȣ) ������ ���ֱ�, �Ʒ��� �׵θ��� ��Ÿ���� ����, ��Ʈ ����		
		jpfPasswd.setBounds(67, 190, 166, 30);
		jpfPasswd.setOpaque(false);
		jpfPasswd.setFont(new Font("�����ٸ����", Font.BOLD, 20));
		jpfPasswd.setForeground(Color.WHITE);
		
		// JTF �Ʒ��� �׵θ��� ������� ��Ÿ���� ����
		jtfId.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
		jtfId.setCaretColor(Color.WHITE);
		
		// JPF �Ʒ��� �׵θ��� ������� ��Ÿ���� ����
		jpfPasswd.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
		jpfPasswd.setCaretColor(Color.WHITE);
		
		// �α��� ��ư ũ��, ��ġ ���� �� ������ ����
		jbtLogin.setBounds(87, 350, 125, 40);
		jbtLogin.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/jbt_login(125x40).png"));

		// �α��� ��ư �⺻ ������, �׵θ� ���ֱ�
		jbtLogin.setContentAreaFilled(false);
		jbtLogin.setBorderPainted(false);
		
		// ��� �󺧿� ������Ʈ �ֱ�
		jlBg.add(jtfId);
		jlBg.add(jpfPasswd);
		jlBg.add(jbtLogin);
		
		// JFrame�� ���� �ֱ�
		add(jlBg);
		
		// �̺�Ʈ ����
		
		SCALoginController scalc = new SCALoginController(this);
		jtfId.addActionListener(scalc);
		jpfPasswd.addActionListener(scalc);
		jbtLogin.addActionListener(scalc);
		
		setBounds(810, 290, 300, 500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	} // SCALoginView

	public JTextField getJtfId() {
		return jtfId;
	} // getJtfId

	public JPasswordField getJpfPasswd() {
		return jpfPasswd;
	} // getJpfPasswd


	public JButton getJbtLogin() {
		return jbtLogin;
	} // getJbtLogin


	public static void main(String[] args) {
		new SCALoginView();
	} // main

} // class
