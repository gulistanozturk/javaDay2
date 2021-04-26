package javaDay2;

import java.util.Locale.Category;

public class Main {

	public static void main(String[] args) {
		
		
		Instructor instructor1= new Instructor(1, "Engin", "Demiro�","Java"); 
		Instructor instructor2= new Instructor(2, "Engin", "Demiro�","C#");
		
		Instructor [] instructors= {instructor1,instructor2};
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor1);
		instructorManager.Update(instructor2);
		
		System.out.println("---------------------------------------------------------------------------");
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name+" "+instructor.surname+" : "+instructor.coursename);
		}
		
		
		System.out.println("---------------------------------------------------------------------------");
		
		
		Course course1= new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "-", "%6", 0, "Engin", "Demiro�");
		Course course2= new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "-", "%56", 0, "Engin", "Demiro�");
		Course course3= new Course(3, "Programlamaya Giri� i�in Temel Kurs", "PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.", "%56", 0, "Engin", "Demiro�");
		
		Course[] courses = {course1,course2,course3};
		
		CourseManager courseManager= new CourseManager();
		courseManager.Add(course1);
		courseManager.Add(course2);
		courseManager.Add(course3);
		
		System.out.println("---------------------------------------------------------------------------");
		
		
		for (Course course : courses) {
			System.out.println("Kurs Ad� : "+course.name+"\n"+"Kurs A��klamas� : "+course.description+"\n"+"Kurs Tamamlanma Oran� : "+course.progression+"\n"+"Kurs Fiyat� : "+course.unitPrice+"\n"+"Kurs E�itmeni : "+course.instructorName +" "+course.instructorSurname);
		
		System.out.println("---------------------------------------------------------------------------");
		}
		
		
		
	}

}
