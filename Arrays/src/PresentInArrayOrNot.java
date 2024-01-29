
public class PresentInArrayOrNot {

	public static void main(String[] args) {
		int marks [] = {40,30,20,10};
		int num =30;
		boolean isInArray = false;
		for(int elements:marks) {
			if(num==elements) {
				isInArray =true;
				break;
			}
		}
		if(isInArray) {
			System.out.println("The value is present in arrays :" +num);
		}else {
			System.out.println("The value is not present in arrays ");
		}

	}

}
