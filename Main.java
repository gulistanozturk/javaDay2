package javaDay2;

import java.util.Locale.Category;

public class Main {

	public static void main(String[] args) {
		
		
		Instructor instructor1= new Instructor(1, "Engin", "Demiroð","Java"); 
		Instructor instructor2= new Instructor(2, "Engin", "Demiroð","C#");
		
		Instructor [] instructors= {instructor1,instructor2};
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor1);
		instructorManager.Update(instructor2);
		
		System.out.println("---------------------------------------------------------------------------");
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name+" "+instructor.surname+" : "+instructor.coursename);
		}
		
		
		System.out.println("---------------------------------------------------------------------------");
		
		
		Course course1= new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "-", "%6", 0, "Engin", "Demiroð");
		Course course2= new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "-", "%56", 0, "Engin", "Demiroð");
		Course course3= new Course(3, "Programlamaya Giriþ için Temel Kurs", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.", "%56", 0, "Engin", "Demiroð");
		
		Course[] courses = {course1,course2,course3};
		
		CourseManager courseManager= new CourseManager();
		courseManager.Add(course1);
		courseManager.Add(course2);
		courseManager.Add(course3);
		
		System.out.println("---------------------------------------------------------------------------");
		
		
		for (Course course : courses) {
			System.out.println("Kurs Adý : "+course.name+"\n"+"Kurs Açýklamasý : "+course.description+"\n"+"Kurs Tamamlanma Oraný : "+course.progression+"\n"+"Kurs Fiyatý : "+course.unitPrice+"\n"+"Kurs Eðitmeni : "+course.instructorName +" "+course.instructorSurname);
		
		System.out.println("---------------------------------------------------------------------------");
		}
		
		
		
	}

}
