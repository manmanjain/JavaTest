package xxx;

import java.util.Scanner;

public class RegexTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		String tel = sc.next();
		//電話號碼
		//作為正則表示法開始的標記
//		String regex = "^09\\d\\d-[0-9]{6}$";
//		
//		if(tel.matches(regex)) {
//			System.out.println("OK");
//		}else {
//			System.out.println("No good...");
//		}
		
		
//		String id = sc.next();
//		//身分證
//		//作為正則表示法開始的標記
//		String regex = "^[A-Z]{1}[1-2]{1}[0-9]{8}$";
//		
//		if(id.matches(regex)) {
//			System.out.println("OK");
//		}else {
//			System.out.println("No good...");
//		}
		
		
		String num = sc.next();
		String regex = "^\\p{Punct}^[a-zA-Z]";
		
		if(!(num.matches(regex))) {
			System.out.println("no");
		}else {
			System.out.println("ok");
		}
		
	}
}
