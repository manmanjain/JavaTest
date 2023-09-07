package homework3;

import java.util.ArrayList;
import java.util.Collections;
import homework2.LotteryNumber;

public class ChooseLotteryNumber extends LotteryNumber {
	public ChooseLotteryNumber(int unlikeNum) {
		super(unlikeNum);
	}

    // 可選擇數字
//    private ArrayList<Integer> likeNumbers(String[] unlikeNums) {
//        ArrayList<Integer> likeNumbers = new ArrayList<>();
//        
//        for (int i = 1; i <= 49; i++) {
//            String numberStr = String.valueOf(i);
//            boolean isUnlike = false;
//            
//            for (String unlikeNum : unlikeNums) {
//                if (numberStr.contains(unlikeNums)) {
//                	isUnlike = true;
//                    break;
//                }
//            }
//            
//            if (!isUnlike) {
//            	likeNumbers.add(i);
//            }
//        }
//        
//        return likeNumbers;
//    }
    
    // 随机生成推荐的六个数字
    private static ArrayList<Integer> generateRecommendedNumbers(ArrayList<Integer> allowedNumbers) {
        ArrayList<Integer> recommendedNumbers = new ArrayList<>(allowedNumbers);
        Collections.shuffle(recommendedNumbers);
        
        return new ArrayList<>(recommendedNumbers.subList(0, 6));
    }
    
    // 显示数字，每六个数字换一行
    private static void displayNumbers(ArrayList<Integer> numbers) {
        int count = 0;
        
        for (Integer number : numbers) {
            System.out.print(number + " ");
            count++;
            
            if (count % 6 == 0) {
                System.out.println();
            }
        }
        
        System.out.println();
    }

}
