package homework5;

public class RandAvg {

	public void randAvg() {
		
		int[] x = new int[10];
		int sum = 0;
		int avg = 0;
		
		
		for(int i = 0 ; i < x.length ; i++) {
			x[i] = (int) (Math.random() * 100) + 1;
			System.out.print(x[i] + " ");
			sum = sum + x[i];
		}
		
		avg = sum / x.length ;
		System.out.println(" ");
		System.out.println("平均值為：" + avg);
		
		
	}
	
	
	public static void main(String[] args) {
		
		RandAvg getRandAvg = new RandAvg();
		getRandAvg.randAvg();
		
	}
		
}
