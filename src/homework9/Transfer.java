package homework9;

public class Transfer {
	int balance = 0;

	synchronized public void deposit(int amount) {
		while (balance > 3000) {
			System.out.println("媽媽看到餘額在3000以上，停止匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += amount;
		System.out.println("媽媽匯了兩千，帳戶共有：" + balance);
		notify();
	}

	synchronized public void withdraw(int amount) {
		while (balance < 1000) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("熊大提領一千，帳戶共有：" + balance);
		if (balance < 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}

class Deposit extends Thread {
	Transfer mom;
	
	public Deposit(Transfer mom) {
		this.mom = mom;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			mom.deposit(2000);
		}
	}
}

class Withdraw extends Thread {
	Transfer brown;
	
	public Withdraw(Transfer brown) {
		this.brown = brown;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			brown.withdraw(1000);
		}
	}

}
