
public class TestS8IC8 {

	public static void main(String[] args) {
		
		int num = 1634;
		boolean amstrong = S8IC8.AmstrongNumber(num);
		if(amstrong)
			System.out.println("The number " + num + "is Amstrong.");
		else
			System.out.println("The number " + num + "is not Amstrong.");

	}

}
