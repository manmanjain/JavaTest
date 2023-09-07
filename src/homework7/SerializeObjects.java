package homework7;

import java.io.*;


public class SerializeObjects {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\data\\Object.ser");
		
		if(!file.exists()) {
			file.mkdirs();
		}
		
		Cat cat1 = new Cat("花花");
		Cat cat2 = new Cat("咪咪");
		Dog dog1 = new Dog("小黑");
		Dog dog2 = new Dog("小黃");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(cat1);
		System.out.println("cat物件導入成功");
		oos.writeObject(cat2);
		System.out.println("cat物件導入成功");
		oos.writeObject(dog1);
		System.out.println("dog物件導入成功");
		oos.writeObject(dog2);
		System.out.println("dog物件導入成功");
				
		oos.close();
		fos.close();
		
	}

}



