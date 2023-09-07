package homework8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTrain {
	public static void main(String[] args) {
		Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train train3 = new Train(118, "自強", "高雄", "台北", 500);
		Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train train8 = new Train(1254, "區間", "屏東", "基隆", 700); // 測試不重複

//		Set<Train> set = new HashSet<Train>();
		List<Train> set = new ArrayList<Train>();
		set.add(train1);
		set.add(train2);
		set.add(train3);
		set.add(train4);
		set.add(train5);
		set.add(train6);
		set.add(train7);
		set.add(train8); // 測試不重複

		System.out.println("for-each========================");
		//for-each
		for (Train tra : set) {
			System.out.println(tra.getNumber() + "," + tra.getType() + "," + tra.getStart() + "," + tra.getDest() + ","
					+ tra.getPrice());
		}
		
		System.out.println("Iterator==============================");
		//Iterator
		for(Iterator<Train> it = set.iterator(); it.hasNext();)
			System.out.println(it.next());
		
		System.out.println("for==============================");
		//for
		for(int i = 0;i<set.size();i++) {
			System.out.println(set.get(i));
			
		}
		

		Set<Train> set2 = new TreeSet<Train>();
		// List list= new ArrayList();
		set2.add(train1);
		set2.add(train2);
		set2.add(train3);
		set2.add(train4);
		set2.add(train5);
		set2.add(train6);
		set2.add(train7);
		set2.add(train8); // 測試不重複

		System.out.println("==============================");
		
		for (Train tra : set2) {
			System.out.println(tra.getNumber() + "," + tra.getType() + "," + tra.getStart() + "," + tra.getDest() + ","
					+ tra.getPrice());
		}
		
		System.out.println("==============================");

		for(Iterator<Train> it = set2.iterator() ; it.hasNext();)
			System.out.println(it.next());
				
	}

}
