class dataMember{
	String stuName;
	int stuId;
	float stuPercentage;
	
	public void inputStuInformation(String name , int id, float percentage){
		stuName=name;
		stuId=id;
		stuPercentage=percentage;
		
	}
	public void outputStuInformation() {
		inputStuInformation("kishor", 5, 78);
		System.out.println("The name of student is :" +stuName);
		System.out.println("And the id of student is :" +stuId);
		System.out.println("And his percentage is " +stuPercentage);
	}
}
public class Student {

	public static void main(String[] args) {
		dataMember member = new dataMember();
		member.outputStuInformation();
		
		
	}

}
