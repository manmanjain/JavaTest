package xxx;

import java.util.Scanner;

public class Homework3 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Homework3 hw3 = new Homework3();

		hw3.triangle();
		hw3.guessNumber();
		hw3.lottery();
	}

	public void triangle() {
		// 第一題
		// 請設計一隻程式，使用者輸入三個數字後，
		// 輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形

		System.out.println("請輸入三個整數");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if ((a + b) >= c || (b + c) >= a || (c + a) >= b) {

			if (a == b && b == c) {
				System.out.println("正三角形");

			} else if (a == b || b == c || c == a) {
				System.out.println("等腰三角形");

			} else {

				if ((a * a + b * b) == c * c || (a * a + c * c) == b * b || (c * c + b * b) == a * a) {
					System.out.println("直角三角形");
				} else {
					System.out.println("其他三角形");
				}
			}

		} else {
			System.out.println("不是三角形");
		}
	}

	public void guessNumber() {
		// 第二題
		System.out.println("開始猜數字吧！");
		int d = sc.nextInt();
		int i;

		i = (int) (Math.random() * 100);

		while (d != i) {
			System.out.println("猜錯囉");

			if (d > i) {
				System.out.println("數字大於答案唷！");
			} else {
				System.out.println("數字小於答案唷！");
			}

			d = sc.nextInt();
		}
		System.out.println("答對囉！答案就是" + i);
	}

	public void lottery() {
		// 第三題
		System.out.println("阿文~請輸入你討厭哪個數字？");
		int e = sc.nextInt();
		int count = 0;

		for (int j = 1; j <= 49; j++) {
			if (j % 10 == e || j / 10 == e) {
				continue;
			}
			count += 1;
			System.out.print(j + " ");
			if (count % 6 == 0) {
				System.out.println();
			}

		}
		System.out.println();
		System.out.println("共有" + count + "個號碼");
	}

}
