package javaDay2;

public class InstructorManager {
	
	public void Add(Instructor instructor) {
		
		System.out.println("Yeni eðitmen eklendi : "+instructor.name +" "+ instructor.surname);
				
	}
	
	public void Delete(Instructor instructor) {
		
		System.out.println("Eðitmen silindi : "+instructor.name +" "+ instructor.surname);		
	}
	
	public void Update(Instructor instructor) {
		System.out.println("Eðitmen bilgileri güncellendi : "+instructor.name +" "+ instructor.surname);
	}

}
