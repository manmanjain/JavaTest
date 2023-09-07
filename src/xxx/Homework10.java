package xxx;

public class Homework10 {
	public static void main(String[] args) {
		int[] ra = new int[5];

		for (int i = 0; i < ra.length; i++) {
			ra[i] = (int) (Math.random() * 100);
		}
		
		for (int i = 0; i < ra.length; i++) {
			System.out.println(ra[i]);
		}
		
		
	}

}
