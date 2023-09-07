package homewok1;

public class Calculate {
	private int a;
	private int b;

	public Calculate() {

	}

	public Calculate(int a, int b) {

	}

	public int geta() {
		return a;
	}

	public int getb() {
		return b;
	}

	public void seta(int x) {
		a = x;
	}

	public void setb(int y) {
		b = y;
	}

	public void sum(int x, int y) {
		int sumXY;
		sumXY = x + y;
		System.out.println(sumXY);
	}

	public void product(int x, int y) {
		int productXY;
		productXY = x * y;
		System.out.println(productXY);
	}
	
	
	public static void main(String[] args) {
		
		Calculate calXY = new Calculate();
		
		calXY.sum(12,6);
		calXY.product(12,6);
		
	}

}
