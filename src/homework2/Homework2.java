package homework2;

public class Homework2 {

	public static void main(String[] args) {

		// 1
		int sum = 0;
		for (int even = 1; even <= 1000; even += 1) {
			if (even % 2 != 0) {
				continue;
			}
			sum += even;
		}
		System.out.println("1～1000的偶數和：" + sum);
		System.out.println("===============");

		// 2
		int j = 1;
		for (int i = 1; i <= 10; i += 1) {
			j = i * j;
		}
		System.out.println("1～10的連乘積:" + j + " (使用用for迴圈)");
		System.out.println("===============");

		// 3
		int i2 = 1, j2 = 1;
		while (i2 <= 10) {
			j2 = i2 * j2;
			i2 += 1;
		}
		System.out.println("1～10的連乘積:" + j2 + " (使用用while迴圈)");
		System.out.println("===============");

		// 4.請設計一隻Java程式，輸出結果為以下：
		// 1 4 9 16 25 36 49 64 81 100
		int j3 = 1;
		for (int i3 = 1; i3 <= 10; i3 += 1) {
			j3 = i3 * i3;
			System.out.print(j3 + " ");
		}
		System.out.println();
		System.out.println("===============");

		// 5.阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字
		// 不論是個位數或是十位數。請設計一隻程式，
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

		System.out.println("可挑選的數字為：");
		int count = 0;
		for (int i4 = 1; i4 <= 49; i4 += 1) {
			if (i4 % 10 == 4 || i4 / 10 == 4) {
				continue;
			}
			count += 1;
			System.out.print(i4 + " ");
		}

		System.out.println();
		System.out.println("共有" + count + "個號碼");
		System.out.println("===============");

		// 6.

		for (int i5 = 1; i5 <= 10; i5 += 1) {
			for (int j5 = 1; j5 <= (11 - i5); j5 += 1) {
				System.out.print(j5);
			}
			System.out.println();
		}
		System.out.println("===============");

		// 請設計一隻Java程式，輸出結果為以下：
//		int letter = 'A';
//		System.out.println(letter);

		int letter = 'A';
		for (int i6 = 1; i6 <= 6; i6 += 1) {

			for (int j6 = 1; j6 <= i6; j6 += 1) {

				System.out.print((char) letter);
			}
			System.out.println();
			letter += 1;
		}

	}

}
