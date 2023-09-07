package xxx;

public class Student {
	int score = 60;
	public void play(int hours){
		score -= hours;
		
	}
	public void study(int hours) {
		score += hours;
	}
	
	public static void main(String[] args) {
		Student mandy = new Student();
		Student dale = new Student();
		
		System.out.println(mandy.score);
		System.out.println(dale.score);
		
		mandy.play(3);
		mandy.study(5);
		
		dale.play(5);
		dale.study(1);
		
		System.out.println(mandy.score);
		System.out.println(dale.score);
		
	}
}