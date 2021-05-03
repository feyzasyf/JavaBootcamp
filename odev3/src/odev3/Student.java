package odev3;

public class Student extends User {
private int grade;


public Student() {}



public Student(int grade) {
	super(); //super(id, firstName, lastName, email, password);
	this.grade = grade;
}



public int getGrade() {
	return grade;
}

public void setGrade(int grade) {
	this.grade = grade;
}




	

}
