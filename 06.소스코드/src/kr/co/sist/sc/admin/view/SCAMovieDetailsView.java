package kr.co.sist.sc.admin.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SCAMovieDetailsView extends JDialog {

	private JTextField jtfMovieCode, jtfMovieTitle, jtfMovieGenre, jtfMovieCountry,
				jtfMovieDirector, jtfMovieGrade, jtfMovieRunningtime, jtfMoviePlaydate, jtfMovieActor;
	private JLabel jlMovieImg;
	
	private JTextArea jtaMovieSynopsis;

	public SCAMovieDetailsView(SCAMovieManageView scammv) {
		super(scammv, "��ȭ �� ����", true);
		setLayout(null);
		setSize(830, 820);
		
		JLabel jlBg = new JLabel();
		jlBg.setBounds(0, 0, 830, 820);
		jlBg.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/cinema/admin/images/admin_detail_movie_bg(830x820).png"));
		
		// jl
		JLabel jlDialogTitle = new JLabel("��ȭ �� ����");
		JLabel jlMovieCode = new JLabel("��ȭ �ڵ�"); 
		JLabel jlMovieTitle = new JLabel("��ȭ ����"); 
		JLabel jlMovieGenre = new JLabel("�帣"); 
		JLabel jlMovieCountry = new JLabel("���� ����"); 
		JLabel jlMovieDirector = new JLabel("����"); 
		JLabel jlMovieGrade = new JLabel("��ȭ ���"); 
		JLabel jlMovieRunningtime = new JLabel("���� Ÿ��"); 
		JLabel jlMoviePlaydate = new JLabel("������"); 
		JLabel jlMovieActor = new JLabel("�⿬��"); 
		
		// jtf
		
		
		jlDialogTitle.setFont(new Font("�����ٸ����", Font.BOLD, 24));
		jlDialogTitle.setForeground(new Color(255, 255, 255));
		jlDialogTitle.setBounds(30, 30, 150, 30);
		
		jlMovieCode.setFont(new Font("�����ٸ����", Font.BOLD, 21));
		jlMovieCode.setForeground(new Color(255, 255, 255));
		jlMovieCode.setBounds(350, 100, 90, 22);
		
		
		jlMovieImg = new JLabel();
		jlMovieImg.setBounds(30, 30, 288, 413);
		jlMovieImg.setBackground(new Color(255, 255, 255));
		
		jlBg.add(jlDialogTitle);
		jlBg.add(jlMovieImg);
		jlBg.add(jlMovieCode);
		
		add(jlBg);
		setLocation(scammv.getX()+100, scammv.getY()+100);
		setVisible(true);
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
	} // SCAMovieDetailsView
	
	public JTextField getJtfMovieCode() {
		return jtfMovieCode;
	}

	public JTextField getJtfMovieTitle() {
		return jtfMovieTitle;
	}

	public JLabel getJlMovieImg() {
		return jlMovieImg;
	}

	public JTextField getJtfMovieGenre() {
		return jtfMovieGenre;
	}

	public JTextField getJtfMovieCountry() {
		return jtfMovieCountry;
	}

	public JTextField getJtfMovieDirector() {
		return jtfMovieDirector;
	}

	public JTextField getJtfMovieGrade() {
		return jtfMovieGrade;
	}

	public JTextField getJtfMovieRunningtime() {
		return jtfMovieRunningtime;
	}

	public JTextField getJtfMoviePlaydate() {
		return jtfMoviePlaydate;
	}

	public JTextField getJtfMovieActor() {
		return jtfMovieActor;
	}

	public JTextArea getJtaMovieSynopsis() {
		return jtaMovieSynopsis;
	}
	
	public static void main(String[] args) {
		new SCAMovieDetailsView(new SCAMovieManageView());
	}
	
} // class
