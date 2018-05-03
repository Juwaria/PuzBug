
public class TestS6IC6 {

	public static void main(String[] args) {

		int[] intArray1 = new int[]{27,78,1023};
		int[] intArray2 = new int[]{27,18,1023};
		boolean compare = S6IC6.compareArray(intArray1, intArray2);
		System.out.println("Are the two arrays equal? : " + compare);
			

	}

}
