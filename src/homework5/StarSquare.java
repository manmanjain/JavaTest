package homework5;

import java.util.Scanner;

public class StarSquare {
	private int width, hight;

	public StarSquare() {

	}

	public StarSquare(int width, int hight) {
		this.width = width;
		this.hight = hight;
	}

	public int getWidth() {
		return width;
	}

	public int getHight() {
		return hight;
	}

	public void setStarSauare(int width, int hight) {

		if (width > 0 && hight > 0) {
			for (int i = 1; i <= hight; i++) {
				for (int j = 1; j <= width; j++) {
					System.out.print("*");

				}
				System.out.println();
			}
		} else {
			System.out.println("請輸入正整數");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StarSquare starsquare = new StarSquare();

		System.out.println("請輸入寬與高");

		int a = sc.nextInt();
		int b = sc.nextInt();

		starsquare.setStarSauare(a, b);

	}

}
