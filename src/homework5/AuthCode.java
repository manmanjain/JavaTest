package homework5;

public class AuthCode {	
	
	public void authCode() {
		String[] authCodeArr = new String[8];
		String[] codeArr = {

				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
				"V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", };
		
		
		for(int i = 0; i < 8 ; i ++) {
			authCodeArr[i] = codeArr[(int)(Math.random()*62)];
		};
		
		System.out.println("本次隨機產生驗證碼為：");
		
		for(int i = 0 ; i < authCodeArr.length ; i ++ ) {
			System.out.print(authCodeArr[i]);			
		}
	}
	
	
	public static void main(String[] args) {
		
		AuthCode getauthCode = new AuthCode();
		
		getauthCode.authCode();
	}
	
	
}
