class q1Student{
	String name;
	String course;
	String dateOfbirth;	
}

class SchoolStudent extends q1Student{
	int fees;
	
	 SchoolStudent() {
	}
	 SchoolStudent(int fees){
		 this.fees = fees;
		 
	 }
}

class CollegeStudent extends q1Student{
	int sem ;
	int fees;
	
	CollegeStudent(){
		
	}
	CollegeStudent(int sem, int fees){
		this.sem = sem;
		this.fees = fees;
	}
}

class PgStudent extends CollegeStudent{
	String mainSubject;
	int percent;
	
	PgStudent(){
		
	}
	PgStudent(String mainSubject , int percent){
		this.mainSubject = mainSubject;
		this.percent = percent;
	}
}

public class Student {

	public static void main(String[] args) {
		

	}

}
