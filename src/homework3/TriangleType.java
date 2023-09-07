package homework3;

import java.util.Scanner;

public class TriangleType {
	private int sideLengthA;
	private int sideLengthB;
	private int sideLengthC;

	public TriangleType() {

	}

	public TriangleType(int a, int b, int c) {

		if (a > 0 && b > 0 && c > 0) {
			sideLengthA = a;
			sideLengthB = b;
			sideLengthC = c;
		} else {
			System.out.println("請輸入正整數");
		}

	}

	public int getSideLengthA() {
		return sideLengthA;
	}

	public void setSideLengthA(int a) throws Exception {
		if (a > 0) {
			sideLengthA = a;
		} else {
			throw new Exception("請輸入正整數");
		}
	}

	public int getSideLengthB() {
		return sideLengthB;
	}

	public void setSideLengthB(int b) throws Exception {
		if (b > 0) {
			sideLengthB = b;
		} else {
			throw new Exception("請輸入正整數");
		}
	}

	public int getSideLengthC() {
		return sideLengthC;
	}

	public void setSideLengthC(int c) throws Exception {
		if (c > 0) {
			sideLengthC = c;
		} else {
			throw new Exception("請輸入正整數");
		}
	}

	public static void cheTriangleType(int a, int b, int c) {
		if ((a + b) >= c || (b + c) >= a || (c + a) >= b) {

			if (a == b && b == c) {
				System.out.println("正三角形");

			} else if (a == b || b == c || c == a) {
				System.out.println("等腰三角形");

			} else if (a == 0 || b == 0 || c == 0) {
				System.out.println("不是三角形");

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

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TriangleType cheTriangle = new TriangleType();

		System.out.println("請輸入三個正整數");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		try {
			cheTriangle.setSideLengthA(a);
		} catch (Exception e) {
			System.out.println("不是三角形；數字1請填正整數");
			e.printStackTrace();
		}

		try {
			cheTriangle.setSideLengthB(b);
		} catch (Exception e) {
			System.out.println("不是三角形；數字2請填正整數");
			e.printStackTrace();
		}

		try {
			cheTriangle.setSideLengthC(c);
		} catch (Exception e) {
			System.out.println("不是三角形；數字3請填正整數");
			e.printStackTrace();
		}

		TriangleType.cheTriangleType(a, b, c);

	}

}
