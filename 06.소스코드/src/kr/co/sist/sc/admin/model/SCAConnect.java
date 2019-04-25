package kr.co.sist.sc.admin.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SCAConnect {
	
	private static SCAConnect sca_conn;
	
	private SCAConnect() {
		
	} // SCAConnect 기본 생성자
	
	public static SCAConnect getInstance() {
		if(sca_conn == null) {
			sca_conn = new SCAConnect();
		} // end if
		return sca_conn;
	} // getInstance
	
	public Connection getConn() throws SQLException{
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} // end catch

		String url = "jdbc:oracle:thin:@211.63.89.133:1521:orcl";
		String user = "scott";
		String password = "tiger";
		
		con = DriverManager.getConnection(url, user, password);
		
		return con;
	} // getConn
	
} // class
