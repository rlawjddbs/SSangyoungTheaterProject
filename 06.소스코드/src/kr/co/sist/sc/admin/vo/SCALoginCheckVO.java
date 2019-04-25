package kr.co.sist.sc.admin.vo;

public class SCALoginCheckVO {

	private String id, passwd;

	public SCALoginCheckVO(String id, String passwd) {
		this.id = id;
		this.passwd = passwd;
	}

	public String getId() {
		return id;
	}

	public String getPasswd() {
		return passwd;
	}
	
} // class
