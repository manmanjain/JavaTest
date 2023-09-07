package xxx;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {

		Homework4 hw4 = new Homework4();

		System.out.println("第一題");
		hw4.AverageValue();
		System.out.println("第二題");
		hw4.ReverseString();
		System.out.println("第三題");
		hw4.PlanetVowels();
		System.out.println("第四題");
		hw4.BorrowMoney();
		System.out.println("第五題");
		hw4.CountDays();
		System.out.println("第六題");
		hw4.TestScore();
	}

	Scanner sc = new Scanner(System.in);

	// 第一題
	public void AverageValue() {
		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0, avg;

		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}

		avg = sum / x.length;
		System.out.println("平均值=" + avg);
		System.out.println("大於平均值的元素為");

		for (int i = 0; i < x.length; i++) {
			if (x[i] > avg) {
				System.out.print(x[i] + " ");
			}
		}

		System.out.println();
	}

	// 第二題
	// 提示說到陣列 =>第一個步驟會把字串取出字元 >放入陣列 >使用排序倒著排回來
	// 有偷偷看Chat GPT它是用 isVowel 的方法，要怎麼查才知道甚麼方法試用呢!?
	public void ReverseString() {
//		String s = "Hello World";
//		char[] cArray = s.toCharArray();

		String s = "Hello World";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();

	}

	// 第三題
	// 這裡用一維陣列，但為甚麼一維陣列裡面的元素也可以用for迴圈提取出來!? 我有點不太懂第二個for迴圈
	public void PlanetVowels() {
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int vowels = 0;
		for (int i = 0; i < planet.length; i++) {
			for (int j = 0; j < planet[i].length(); j++) {
				char c = planet[i].charAt(j);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels += 1;
				}

			}
		}
		System.out.println("母音共為" + vowels + "個");

	}

	// 第四題
	// 看了程式碼，知道他為甚麼會這樣做，但自己要寫一開始會卡關
	public void BorrowMoney() {
		int[][] coworker = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 }

		};
		System.out.println("請輸入欲借的金額");
		int money = sc.nextInt();
		int number = 0;
		System.out.println("有錢可借的員工編號：");
		for (int i = 0; i < coworker.length; i++) {
			if (money <= coworker[i][1]) {
				System.out.print(coworker[i][0] + " ");
				number += 1;
			}

		}
		System.out.println("共" + number + "人");
	}

	// 第五題
	public void CountDays() {
		// 閏月規則：天數/4=0、天數/100 != 0、天數/400 =0
		// 所以先判斷出二月式幾天 寫判斷式二月是幾天(由閏月規則知道) =>用一個變數表示
		// 將月份及天數放進去陣列 => for迴圈累加天數
		// 在將以上月份的天數加日 => 答案
		int feb = 0;
		System.out.println("請輸入西元年");
		int years = sc.nextInt();
		if (years % 4 == 0 && years / 100 != 0 || years / 400 == 0) {
			feb = 29;
		} else {
			feb = 28;
		}

		System.out.println("請輸入月份 1-12 ");
		int i = sc.nextInt();
		int days = 0;
		int[][] month = { { 1, 31 }, { 2, feb }, { 3, 31 }, { 4, 30 }, { 5, 31 }, { 6, 30 }, { 7, 31 }, { 8, 31 },
				{ 9, 30 }, { 10, 31 }, { 11, 30 }, { 12, 31 } };
		for (i -= 2; i >= 0; i--) {
			days += month[i][1];
		}

		System.out.println("請輸入日");
		int day = sc.nextInt();
		days += day;

		System.out.println("第" + days + "天");
	}
	
	//第六題
	public void TestScore() {
		int testScore = 0;
		int hightNum = 0;
		int[][] score = {
				{1,2,3,4,5,6,7,8},
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75},	
		};
		for(int i =1;i<score.length;i++) {
			for(int j =0;j<=score.length;j++)
				if(score[i][j]>=testScore) {
				testScore = score[i][j];
				hightNum = score[0][j] ;
			}
			System.out.println("第"+ i +"次小考");
			System.out.println("最高分"+testScore);
			System.out.println("考最高的同學是編號"+ hightNum);
			System.out.println();
			testScore = 0 ;
		}
	}
}

