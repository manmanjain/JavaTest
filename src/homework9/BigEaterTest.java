package homework9;

public class BigEaterTest {
	public static void main(String[] args) {
		BigEater p1 = new BigEater("饅頭人");
		BigEater p2 = new BigEater("詹姆士");

		System.out.println("---大胃王快食比賽開始!!!---");

		try {
			p1.p.join();
			p2.p.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---大胃王快食比賽結束!!!---");

	}

}
