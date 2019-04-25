package kr.co.sist.sc.admin.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import kr.co.sist.sc.admin.vo.SCALoginCheckVO;
import kr.co.sist.sc.admin.vo.SCALoginVO;
import kr.co.sist.sc.admin.vo.SCAMemberSelectVO;


public class SCALoginDAO {

	private static SCALoginDAO scal_dao;
	
	private SCALoginDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} // end catch
	} // SCALoginDAO
	
	public static SCALoginDAO getInstance() {
		if( scal_dao == null ) {
			scal_dao = new SCALoginDAO();
		} // end if
		return scal_dao;
	} // getInstance
	
	public SCALoginVO loginAdmin(SCALoginCheckVO scalcvo) throws SQLException {
		SCALoginVO scalvo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = SCAConnect.getInstance().getConn();
			
			String selectAdminTab = " SELECT ADMIN_ID, NAME, PASSWORD FROM ADMIN WHERE ADMIN_ID=? AND PASSWORD=? ";
			pstmt = con.prepareStatement(selectAdminTab);
			pstmt.setString(1, scalcvo.getId());
			pstmt.setString(2, scalcvo.getPasswd());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				scalvo = new SCALoginVO(rs.getString("ADMIN_ID"), rs.getString("NAME"));
			} // end if
			
			return scalvo;
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(rs != null) { rs.close(); } // end if
			if(pstmt != null) { pstmt.close(); } // end if
			if(con != null) { con.close(); } // end if
		}
		
		return scalvo;
	} // loginAdmin
	
	
} // class
