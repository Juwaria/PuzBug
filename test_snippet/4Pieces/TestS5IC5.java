
public class TestS5IC5 {

	public static void main(String[] args) {

		int k = 349;
		boolean prime = S5IC5.primeCheck(k);
		if(prime)
			System.out.println(k + " is Prime Number");
		else
		   System.out.println(k + " is not Prime Number");

	}

}
