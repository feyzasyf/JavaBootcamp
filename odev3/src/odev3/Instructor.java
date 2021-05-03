package odev3;

public class Instructor extends User {
	private String introduction;
	
	public Instructor() {}
	
	public Instructor(String introduction) {
		super(); //super(id, firstName, lastName, email, password);
		this.introduction = introduction;
	}
	
	public String getIntroduction() {
		return this.introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	

}
