package homework7;

import java.io.*;

public class RandomFile {
	public static void main(String[] args) throws IOException {

		FileWriter rd = new FileWriter("C:\\javawork\\Data.txt", true);
		BufferedWriter bw = new BufferedWriter(rd);
		PrintWriter pw = new PrintWriter(bw);

		int[] getRandom = new int[10];

		for (int i = 0; i < getRandom.length; i++) {
			getRandom[i] = (int) (Math.random() * 1000 + 1);

		}

		for (int i = 0; i < getRandom.length; i++) {
			// System.out.println(getRandom[i]);
			pw.print(getRandom[i] + " ");
		}
		pw.println();
		
		System.out.println("已經值輸入並保存");
		pw.close();
		bw.close();
		rd.close();
	}
}
