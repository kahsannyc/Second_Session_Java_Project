package loops;

public class FoorLoop {

	public static void main(String[] args) {
		String country = "Bangla";
		for (int i = 0; i<=100; i++) {
			if(i%2==1) {
				System.out.println(i+": " +country);

			}
		}
		String country2="Bangla";
		
		for (int i=0; i<=100; i++) {
			System.out.println(i+": " +country2);
		}

	}

}
