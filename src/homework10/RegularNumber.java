package homework10;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class RegularNumber {
	public static void main(String[] args) {
		System.out.println("請輸入數字：");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String regex = "^(\\p{Digit})*$";

		while (!(num.matches(regex))) {
			System.out.println("數字格式不正確，請再輸入一次");
		}

		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
		BigDecimal bdNum = new BigDecimal(String.valueOf(num));
		int choose = sc.nextInt();

		switch (choose) {
		case 1:
			Format dfm1 = new DecimalFormat("#,###.##");
			System.out.println("千分位數字：" + dfm1.format(bdNum));
			break;

		case 2:
			Format dfm2 = new DecimalFormat("#%");
			System.out.println("百分比數字：" + dfm2.format(bdNum));
			break;

		case 3:
			Format dfm3 = new DecimalFormat("0.###E0");
			System.out.println("科學記號數字：" + dfm3.format(bdNum));
			break;

		default:
			System.out.println("請輸入數字1-3");
			break;
		}

	}

}