package xxx;

public class TestBMI {
	public static void main(String[] args) {
	
		double weight=55,height=156,BMI,heightM;
		
		heightM = height / 100;
		BMI = weight / (heightM*heightM);
		System.out.println("BMI="+BMI);
		
		if (BMI >= 24) {
			System.out.println("過胖");
		}
		else if (BMI < 24 && BMI >=18.5){
			System.out.println("正常");
		}
		else {
			System.out.println("過瘦");
			
		}		
	}
}
