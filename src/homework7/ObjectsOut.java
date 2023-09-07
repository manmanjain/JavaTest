package homework7;

import java.io.*;

public class ObjectsOut {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			while(true) {
				((Animal) ois.readObject()).speak();
			}
			
		}catch(Exception e){
			System.out.println("資料讀取完畢");
		}
		
		ois.close();
		fis.close();
		
	}
	

}
