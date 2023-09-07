package homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		try {
			System.out.println("請輸入x值：");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			System.out.println("請輸入y值：");
			int y = sc.nextInt();

			cal = new Calculator(x, y);
			System.out.println(x + "的" + y + "次方等於" + cal.powerXY());

		} catch (CalException a) {
			System.out.println(a.getMessage());
			return;
		} catch (InputMismatchException b) {
			System.out.println("輸入格式不正確");
			return;
			//b.printStackTrace();
		}

	}
}
