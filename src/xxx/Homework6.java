package xxx;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		int xx, yy;
		//double xy;
		int xy;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x的值：");
		if (sc.hasNextInt()) {
			xx = sc.nextInt();
		} else {
			System.out.println("請輸入整數");
		}

		System.out.println("請輸入y的值：");
		if (sc.hasNextInt()) {
			yy = sc.nextInt();
		} else {
			System.out.println("請輸入整數");
		}

		Calculator cal = new Calculator();
		xy = cal.powerXY();
		System.out.println(xy);

	}
}

class Calculator {
	private int x ;
	private int y ;

	public Calculator() {

	}

	public Calculator(int xx, int yy) {
		this.x = xx;
		this.y = yy;
	}
	
	//為甚麼會報錯呢!?
//	public Calculator(int x) {
//		this(x,1);
//	}
//	
//	public Calculator(int y) {
//		this(1,y);
//	}

	public int getX(int xx) {
		return x;
	}

	public int getY(int yy) {
		return y;
	}

	//如果int運算不是可以晉升成double；為甚麼這樣做main方法會報錯呢?!
//	public double powerXY() {
//		double xy = Math.pow(x,y);
//		return xy;
//	}
	
	public int powerXY() {
		int xy = (int)Math.pow(x,y);
		return xy;
	}
	
}

