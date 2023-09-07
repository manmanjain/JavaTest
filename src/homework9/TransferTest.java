package homework9;

public class TransferTest {
	public static void main(String[] args) {
		Transfer transfer = new Transfer();
		
		Deposit deposit = new Deposit(transfer);
		Withdraw withdraw = new Withdraw(transfer);
		
		deposit.start();
		withdraw.start();
		
		try {
			deposit.join();
			withdraw.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("結束");
		
	}
}
