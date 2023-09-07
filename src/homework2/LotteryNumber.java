package homework2;

public class LotteryNumber {
	private int unlikeNum = 4;
	
	public LotteryNumber() {
		
	}
	
	public LotteryNumber(int a) {
		if(a > 0) {
			unlikeNum = a;
		}else {
			System.out.println("請輸入正整數");
		}
		
	}
	
	public int getNnlikeNum() {
		return unlikeNum;
	}
	
	public void setNnlikeNum(int a) {
		if(a > 0) {
			unlikeNum = a;
		}else {
			System.out.println("請輸入正整數");
		}
	}
	
	
	public void lotteryNum(int a) {
		System.out.println("可挑選的數字為：");
		for (int i = 1; i <= 49; i += 1) {
			if (i % 10 == a || i / 10 == a) {
				continue;
			}
			System.out.print(i + " ");
		}

	}
	
	public void countLotteryNum(int a) {
		int count = 0;
		for (int i = 1; i <= 49; i += 1) {
			if (i % 10 == a || i / 10 == a) {
				continue;
			}
			count += 1;
		}

		System.out.println("共有" + count + "個號碼");
	}
	
	
	public static void main(String[] args) {
		
		LotteryNumber lotteryNum = new LotteryNumber();
		
		lotteryNum.lotteryNum(4);
		System.out.println();
		lotteryNum.countLotteryNum(4);
	}
}
