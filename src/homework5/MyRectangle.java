package homework5;

public class MyRectangle {

	private double width;
	private double depth;

	public MyRectangle() {

	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double area() {
		double area = width * depth;
		return area;

	}
	
	public static void main(String[] args) {

		MyRectangle rectangleArea1 = new MyRectangle();
		rectangleArea1.setWidth(10.0);
		rectangleArea1.setDepth(20.0);
		double area1 = rectangleArea1.area();
		System.out.println("width*depth=" + area1);

		MyRectangle rectangleArea2 = new MyRectangle(10.0, 20.0);
		double area2 = rectangleArea2.area();
		System.out.println("width*depth=" + area2);

	}

}
