package homewok1;

public class CalculateCircle {
	private double radius;

	public CalculateCircle() {

	}

	public CalculateCircle(double x) {
		if (x > 0) {
			radius = x;
		} else {
			System.out.println("請輸入正整數");
		}
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double x) {
		if (x > 0) {
			radius = x;
		} else {
			System.out.println("請輸入正整數");
		}
	}

	public void claCircleArea(double x) {
		// 1.Use API:Math.PI
		// double circleArea = x * x * Math.PI;

		// 2.Use API:Math.pow & Math.PI
		double circleArea = Math.pow(x, 2) * Math.PI;

		System.out.println("半徑為：" + x + "圓面積為：" + circleArea);

	}

	public void claCircumference(double x) {
		// Use API:Math.PI

		double circumference = 2 * Math.PI * x;
		System.out.println("半徑為：" + x + "圓周長為：" + circumference);
	}

	
	public static void main(String[] args) {

		CalculateCircle calCircle = new CalculateCircle();

		calCircle.claCircleArea(5);
		calCircle.claCircumference(5);

	}

}
