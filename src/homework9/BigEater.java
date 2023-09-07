package homework9;

public class BigEater implements Runnable {
	String name;
	Thread p;

	BigEater(String threadName) {
		name = threadName;
		// 這裡的this我不太清楚是什麼
		p = new Thread(this,name);
		p.start();
	}

	public void run() {

		try {
			for (int round = 1; round <= 10; round++) {
				int rest = (int) (Math.random() * 2500) + 500;
				System.out.println(name + "吃第" + round + "碗飯");
				Thread.sleep(rest);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "吃完了!");

	}

}
