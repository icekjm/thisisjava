package ch06;

public class MemberVO {
	//VO: Value Object 값을 담아두는 객체
	//DTO: Data Transfer Object
	private int memberid;
	private String id;
	private String name;
	private String pwd;
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
		
	//getter setter 자동생성해주는 단축키
	//art+shift+s > r > alt+a > r
	// Source > Generate Getters and Setters
	
	
	//DAO(Data Access Object):DB에 있는 데이터를 넣든 DB에 있는 데이터를 가지고 오는 역할
	
	
	
	
	
	
}
