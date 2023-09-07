package xxx;

public class Homework1 {
	public static void main(String[] args) {
		// 1
		int x = 12, y = 6;

		int sum = x + y;
		int product = x * y;

		System.out.println("12、6和為" + sum);
		System.out.println("12、6積為" + product);
		System.out.println("====================");

		// 2
		int tittleEgg = 200;

		int dozen = tittleEgg / 12;
		int grain = tittleEgg % 12;

		System.out.println(tittleEgg + "顆蛋");
		System.out.println("共是" + dozen + "打" + grain + "顆");
		System.out.println("====================");

		// 3
		int time = 256559;

		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / (60 * 60)) % 24;
		int day = time / (24 * 60 * 60);

		System.out.println(time + "秒為");
		System.out.println(day + "天" + hour + "小時" + minute + "分鐘" + second + "秒");
		System.out.println("====================");

		// 4
		final double pi = 3.1415;
		double Radius = 5;

		double CircleArea = Radius * Radius * pi;
		double Circumference = Radius * 2 * pi;

		System.out.println("半徑為" + Radius + "的圓");
		System.out.println("圓面積為" + CircleArea);
		System.out.println("圓周長為" + Circumference);
		System.out.println("====================");

		// 5
		double PV = 1_500_000, R = 0.02;
		int n = 10;

		double FV = PV * Math.pow((1 + R), n);

		System.out.println("每年一期," + n + "期後;" + "本金加利息共有" + FV + "元");
		System.out.println("====================");

		// 請寫一隻程式,利用System.out.println()
		// 印出以下三個運算式結果:
		// 5 + 5
		// 5 + ‘5’
		// 5 + “5”
		// 並請用註解各別說明答案的產生原因
		int a = 5;
		char b = '5';
		String c = "5";
		//int d = '5';
		//System.out.println("字元5為" + d); 

		System.out.println("第六題答案：");
		System.out.println(a + a); // 因為整數加整數，所以5+5=10
		System.out.println(a + b); // 因為字元編號5為53，所以5+53=58
		System.out.println(a + c); // 因為整數加字串會相連，所以5+"5"=55
		System.out.println("====================");
	}
}
