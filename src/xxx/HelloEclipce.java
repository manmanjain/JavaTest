package xxx;

import java.util.Scanner;

public class HelloEclipce {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
/*
		// 第一題
		// int width,hight; 為甚麼我先打在這裡，就會要我例外處理呢?
		System.out.println("請輸入寬：");

		int width = sc.nextInt();
		System.out.println("請輸入高：");
		int hight = sc.nextInt();

		for (int i = 1; i <= hight; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("====================");
*/
		
		
		// 第二題
		
		int[] randomArray = new int[10];
		int sum = 0;

		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 100);

		}

		for (int i = 0; i < randomArray.length; i++) {
			System.out.print(randomArray[i] + " ");
		}

		for (int i = 0; i < randomArray.length; i++) {

			sum += randomArray[i];
		}
		System.out.println();
		System.out.print(sum);
		
		
		//第三題

	}

}
