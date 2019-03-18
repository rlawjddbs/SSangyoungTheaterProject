package kr.co.sist.cinema.admin.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.sist.cinema.admin.vo.SCALoginVO;

public class SCALoginDAO {
	private static SCALoginDAO scal_dao;
	
	private SCALoginDAO() {
		
	} // SCALoginDAO
	
	public static SCALoginDAO getInstance() {
		if (scal_dao == null) {
			scal_dao = new SCALoginDAO();
		} // end if
		
		return scal_dao;
	} // getInstance

	public SCALoginVO loginCheck(String id, String passwd) throws SQLException {
		SCALoginVO scal_vo = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = SCAConnect.getInstance().getConn();
			
			String selectQuery = 
					"select id, pass, name " + 
					"from test_login " + 
					"where id = ? and pass = ?";
			
			pstmt = con.prepareStatement(selectQuery);
			
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				if (id.equals(rs.getString("id")) && passwd.equals(rs.getString("pass"))) {
					scal_vo = new SCALoginVO(
							rs.getString("id"), 
							rs.getString("pass"), 
							rs.getString("name"));
				} // end if
			} // end while
		} finally {
			if (pstmt != null) { pstmt.close(); } // end if
			if (con != null) { con.close(); } // end if
		} // end finally
		
		return scal_vo;
	} // loginCheck
	
} // class
