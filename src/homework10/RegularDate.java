package homework10;

import static java.lang.System.out;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RegularDate {
	public static void main(String[] args) throws Exception {
		System.out.println("請輸入日期(年月日，例如：20110131):");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String regex = ("^\\d{4}[0-1]{1}\\d{1}[0-3]{1}\\d{1}$");
		
		while(!(num.matches(regex))) {
			System.out.println("日期格式不正確，請再輸入一次！");
		}
		
		System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年");
		Date sdf = new SimpleDateFormat("yyyyMMdd").parse(num);
		int choose = sc.nextInt();
		
		switch(choose) {
		case 1:
			Format sdf1 = new SimpleDateFormat("yyyy/MM/dd");
			out.println("年/月/日：" + sdf1.format(sdf));
			break;
		case 2:
			Format sdf2 = new SimpleDateFormat("MM/dd/yyyy");
			out.println("月/日/年：" + sdf2.format(sdf));
			break;	
		case 3:
			Format sdf3 = new SimpleDateFormat("MM/dd/MM/yyyy");
			out.println("日/月/年：" + sdf3.format(sdf));
			break;	
		
		}
	}
	
}
