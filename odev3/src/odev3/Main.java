package odev3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.setFirstName("Leyla");
		student.setLastName("Caliskan");
		student.setGrade(98);
			
		System.out.println("Ogrencinin adi: " +student.getFirstName() + " " + student.getLastName());
		
		Instructor i = new Instructor();
		i.setFirstName("Engin");
		i.setLastName(" Demirog");
		i.setIntroduction("Canim hocam <3");
		
		System.out.println("Dersin hocasi: " +i.getFirstName() + i.getLastName()+ ", " +i.getIntroduction());

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(i);
		instructorManager.addHomework();

		StudentManager studentManager = new StudentManager();
		studentManager.showGrades(student);
}
}
