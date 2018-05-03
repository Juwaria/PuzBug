
public class TestS7IC7 {

	public static void main(String[] args) {

		int intArray[] = new int[]{5,90,35,45,150,3};
		System.out.println("Array Before Bubble Sort");
		for(int i=0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		S7IC7.bubbleSort(intArray);
		System.out.println("Array After Bubble Sort");
		for(int i=0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}

}
