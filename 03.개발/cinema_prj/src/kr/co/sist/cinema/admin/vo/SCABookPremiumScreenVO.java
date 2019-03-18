package kr.co.sist.cinema.admin.vo;

public class SCABookPremiumScreenVO {
	private String member_id, name, birthdate;

	public SCABookPremiumScreenVO(String member_id, String name, String birthdate) {
		this.member_id = member_id;
		this.name = name;
		this.birthdate = birthdate;
	} // SCABookPremiumScreenVO

	public String getMember_id() {
		return member_id;
	}

	public String getName() {
		return name;
	}

	public String getBirthdate() {
		return birthdate;
	}
	
} // class
