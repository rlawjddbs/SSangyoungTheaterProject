package kr.co.sist.cinema.admin.vo;

public class SCALoginVO {
	private String id, passwd, name;

	public SCALoginVO(String id, String passwd, String name) {
		this.id = id;
		this.passwd = passwd;
		this.name = name;
	} // SCALoginVO

	public String getId() {
		return id;
	}

	public String getPasswd() {
		return passwd;
	}
	
	public String getName() {
		return name;
	}
	
} // class
