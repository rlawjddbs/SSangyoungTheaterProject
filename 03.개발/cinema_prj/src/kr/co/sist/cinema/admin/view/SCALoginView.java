package kr.co.sist.cinema.admin.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kr.co.sist.cinema.admin.controller.SCALoginController;

@SuppressWarnings("serial")
public class SCALoginView extends JFrame {
	private JTextField jtfId;
	private JPasswordField jpfPasswd;
	private JButton jbtLogin;
	
	public SCALoginView() {
		super("쌍용관  - 로그인");
		
		Color btnColor = new Color(0x008CEA);
		
		jtfId = new JTextField("admin");
		jtfId.setFont(new Font("Serif", Font.BOLD, 20));
		
		jpfPasswd = new JPasswordField("1234");
		jpfPasswd.setFont(new Font("Serif", Font.BOLD, 20));
		
		jbtLogin = new JButton("로그인");
		jbtLogin.setFont(new Font("SansSerif", Font.BOLD, 16));
		jbtLogin.setBackground(btnColor);
		jbtLogin.setForeground(Color.WHITE);
		jbtLogin.setFocusable(false);
		
		JLabel jlblBackground = new JLabel(new ImageIcon(
				"C:/dev/workspace/cinema_prj/src/kr/co/sist/cinema/admin/images/admin_login_bg(300x500).png"));
		jlblBackground.setBounds(0, 0, 300, 500);
		
		JPanel jpLogin = new JPanel();
		jpLogin.setLayout(new GridLayout(3, 1));
		jpLogin.setBackground(Color.LIGHT_GRAY);
		jpLogin.setBounds(47, 200, 200, 150);
		
		jpLogin.add(jtfId);
		jpLogin.add(jpfPasswd);
		jpLogin.add(jbtLogin);

		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.WHITE);
		
		jp.add(jpLogin);
		jp.add(jlblBackground);
		
		add(jp);
		
		SCALoginController scalc = new SCALoginController(this);
		
		jtfId.addActionListener(scalc);
		jpfPasswd.addActionListener(scalc);
		jbtLogin.addActionListener(scalc);
		
		addWindowListener(scalc);
		
		setSize(300, 520);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	} // SCALoginView

	public JTextField getJtfId() {
		return jtfId;
	}

	public JPasswordField getJpfPasswd() {
		return jpfPasswd;
	}

	public JButton getJbtLogin() {
		return jbtLogin;
	}
	
} // class
