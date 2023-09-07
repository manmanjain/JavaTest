package homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		//List<Object> list = new ArrayList<Object>();
		List<Object> list = new ArrayList<Object>();
		list.add(new Integer(100));		
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		System.out.println("使用迭代器輸出");
		Iterator objs = list.iterator();
		while(objs.hasNext()) {
			System.out.println(objs.next());
		}
		System.out.println("===============================");
		
		System.out.println("使用for迴圈");
		for(int i = 0; i <list.size();i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		System.out.println("===============================");
		
		System.out.println("使用foreach");
		for(Object xx : list)
			System.out.println(xx);
		System.out.println("===============================");
		
		
		Iterator obj2 = list.iterator();
		while (obj2.hasNext()) {
			Object o = obj2.next();
			if (o instanceof Number) {
				
			}
		}
		
	}
}
