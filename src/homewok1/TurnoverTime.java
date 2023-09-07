package homewok1;

public class TurnoverTime {
	private int time;

	public TurnoverTime() {

	}

	public TurnoverTime(int x) {
		time = x;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int x) {
		
		if( x < 0) {
			System.out.println("不得輸入負數");
		}else {
			time = x;
		}
		
	}

	public void calTime(int x) {
		int second = x % 60;
		int minute = (x / 60) % 60;
		int hour = (x / (60 * 60)) % 24;
		int day = x / (24 * 60 * 60);
		System.out.println(x + "秒為：" + day + "天" + hour + "小時" + minute + "分鐘" + second + "秒");
	}
	
	public static void main(String[] args) {
		
		TurnoverTime turnTime = new TurnoverTime();
		turnTime.calTime(256559);
		
	}

}
