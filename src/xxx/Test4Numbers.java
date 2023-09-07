package xxx;

public class Test4Numbers {

//請建立一個Test4Numbers.java，可輸出0～100裡4的倍數
	public static void main(String[] args) {

		// while
		int num = 1;
		while (num <= 100) {
			num += 1;
			{
				if (num % 4 == 0)
					System.out.print(num + " ");
			}
		}

		System.out.println();

		// for
		for (int num2 = 1; num2 <= 100; num2 += 1) {
			if (num2 % 4 == 0)
				System.out.print(num2 + " ");
		}

		System.out.println();

		// do...while

		int num3 = 1;
		do {
			if (num3 % 4 == 0)
				System.out.print(num3 + " ");
			num3 += 1;
		} while (num3 <= 100);

		// 一：使用for迴圈 + while迴圈
//		int i;
//		for(i=1; i <= 9; i+=1){
//			int j = 1;
//			while(j <= 9) {
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//				j+=1;
//			}
//			System.out.println();
//		}

		// 使用for迴圈 + do while迴圈
//		int i;
//		for (i = 1; i <= 9; i += 1) {
//			int j = 1;
//
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j += 1;
//			} while (j <= 9);
//			System.out.println();
//		}

		//使用while迴圈 + do while迴圈
//		int i = 0;
//		while (i <= 8) {
//			i += 1;
//			int j = 1;
//
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j += 1;
//			} while (j <= 9);
//			System.out.println();
//		}

	}
}
