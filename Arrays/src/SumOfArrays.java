
public class SumOfArrays {

	public static void main(String[] args) {
		float [] marks = {45.7f,66.7f,89.3f,77.2f};
		float sum = 0;
		for(int i =0; i<marks.length;i++) {
			sum += marks[i];
		}
		System.out.println("Total marks " +sum);
	}

}
