class namestudent{
	String stuName;
	int stuId;
	float stuPercentage;
	
	namestudent(String stuName, int stuId, float stuPercentage) {
		this.stuName = stuName;
		this.stuId = stuId;
		this.stuPercentage = stuPercentage;
	}
	
	public String getStuName() {
		return stuName;
	}

	public int getStuId() {
		return stuId;
	}

	public float getStuPercentage() {
		return stuPercentage;
	}

	public void showInformation() {
		System.out.println("The name of student is :" +stuName);
		System.out.println("The id of student is :"+stuId);
		System.out.println("The percentage of student is :" +stuPercentage);
	}
	
}
public class StudentCon {

	public static void main(String[] args) {
		namestudent stu = new namestudent("kishor", 5, 77);
		stu.showInformation();
	}

}
