package javaDay2;

public class Course{
	
	public Course(int id, String name, String description, String progression,int unitPrice,String instuctorName,String instructorSurname) {
	
		this.id=id;
		this.name= name;
		this.description=description;
		this.progression=progression;
		this.unitPrice=unitPrice;
		this.instructorName= instuctorName;
		this.instructorSurname= instructorSurname;
	}
	
	int id;
	String name;
	String description;
	String progression;
	int unitPrice;
	String instructorName;
	String instructorSurname;
	
	

}
