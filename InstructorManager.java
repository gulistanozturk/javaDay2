package javaDay2;

public class InstructorManager {
	
	public void Add(Instructor instructor) {
		
		System.out.println("Yeni e�itmen eklendi : "+instructor.name +" "+ instructor.surname);
				
	}
	
	public void Delete(Instructor instructor) {
		
		System.out.println("E�itmen silindi : "+instructor.name +" "+ instructor.surname);		
	}
	
	public void Update(Instructor instructor) {
		System.out.println("E�itmen bilgileri g�ncellendi : "+instructor.name +" "+ instructor.surname);
	}

}
