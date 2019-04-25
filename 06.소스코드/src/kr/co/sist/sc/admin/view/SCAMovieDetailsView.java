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
		super(scammv, "영화 상세 정보", true);
		setLayout(null);
		setSize(830, 820);
		
		JLabel jlBg = new JLabel();
		jlBg.setBounds(0, 0, 830, 820);
		jlBg.setIcon(new ImageIcon("C:/dev/workspace/cinema_prj/src/kr/co/sist/cinema/admin/images/admin_detail_movie_bg(830x820).png"));
		
		// jl
		JLabel jlDialogTitle = new JLabel("영화 상세 정보");
		JLabel jlMovieCode = new JLabel("영화 코드"); 
		JLabel jlMovieTitle = new JLabel("영화 제목"); 
		JLabel jlMovieGenre = new JLabel("장르"); 
		JLabel jlMovieCountry = new JLabel("제작 국가"); 
		JLabel jlMovieDirector = new JLabel("감독"); 
		JLabel jlMovieGrade = new JLabel("영화 등급"); 
		JLabel jlMovieRunningtime = new JLabel("러닝 타임"); 
		JLabel jlMoviePlaydate = new JLabel("개봉일"); 
		JLabel jlMovieActor = new JLabel("출연진"); 
		
		// jtf
		
		
		jlDialogTitle.setFont(new Font("나눔바른고딕", Font.BOLD, 24));
		jlDialogTitle.setForeground(new Color(255, 255, 255));
		jlDialogTitle.setBounds(30, 30, 150, 30);
		
		jlMovieCode.setFont(new Font("나눔바른고딕", Font.BOLD, 21));
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
