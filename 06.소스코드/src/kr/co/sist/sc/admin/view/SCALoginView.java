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
		// 프레임 레이아웃 null
		setLayout(null);
		
		// 배경 이미지 전용 라벨 생성, 아이콘 설정, 배치
		JLabel jlBg = new JLabel();
		jlBg.setBounds(0, 0, 300, 500);
		jlBg.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/admin_login_bg(300x500).png"));
		
		// 컴포넌트 생성
		jtfId = new JTextField();
		jpfPasswd = new JPasswordField();
		jbtLogin = new JButton();

		// JTF(아이디) 배경색상 없애기, 폰트 설정
		jtfId.setBounds(67, 150, 166, 30);
		jtfId.setOpaque(false);
		jtfId.setFont(new Font("나눔바른고딕", Font.BOLD, 20));
		jtfId.setForeground(Color.WHITE);
		
		// JPF(비밀번호) 배경색상 없애기, 아랫쪽 테두리만 나타나게 설정, 폰트 설정		
		jpfPasswd.setBounds(67, 190, 166, 30);
		jpfPasswd.setOpaque(false);
		jpfPasswd.setFont(new Font("나눔바른고딕", Font.BOLD, 20));
		jpfPasswd.setForeground(Color.WHITE);
		
		// JTF 아랫쪽 테두리만 흰색으로 나타나게 설정
		jtfId.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
		jtfId.setCaretColor(Color.WHITE);
		
		// JPF 아랫쪽 테두리만 흰색으로 나타나게 설정
		jpfPasswd.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
		jpfPasswd.setCaretColor(Color.WHITE);
		
		// 로그인 버튼 크기, 위치 설정 및 아이콘 설정
		jbtLogin.setBounds(87, 350, 125, 40);
		jbtLogin.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/sc/admin/images/jbt_login(125x40).png"));

		// 로그인 버튼 기본 배경색상, 테두리 없애기
		jbtLogin.setContentAreaFilled(false);
		jbtLogin.setBorderPainted(false);
		
		// 배경 라벨에 컴포넌트 넣기
		jlBg.add(jtfId);
		jlBg.add(jpfPasswd);
		jlBg.add(jbtLogin);
		
		// JFrame에 배경라벨 넣기
		add(jlBg);
		
		// 이벤트 설정
		
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
