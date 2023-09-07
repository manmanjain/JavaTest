package homework10;

public class PrimeNumber {

	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if(isPrime(arr[i]) == true) {
				System.out.println(arr[i] + "是質數");
			}else {
			System.out.println(arr[i] + "不是質數");
			}
		}

	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		
		for (int i = 2; i <= (int) Math.sqrt(number); i++) {
			while (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}