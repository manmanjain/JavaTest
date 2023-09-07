package homewok1;

public class Dozen {

	private int grain;

	public Dozen() {

	}

	public Dozen(int x) {
		grain = x;
	}

	public int getGrain() {
		return grain;
	}

	public void setGrain(int x) {
		if (x < 0) {
			System.out.println("不能為0或負數");
		} else {
			grain = x;
		}
	}

	public void claEgg(int x) {

		int dozenEgg = x / 12;
		int grainEgg = x % 12;
		System.out.println(x + "顆蛋共是" + dozenEgg + "打" + grainEgg + "顆");
	}
	
	
	public static void main(String[] args) {
		
		Dozen totalEgg = new Dozen();
		totalEgg.claEgg(200);
	}

}
