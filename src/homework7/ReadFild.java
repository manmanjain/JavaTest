package homework7;

import java.io.*;

public class ReadFild {
	public static void main(String[] args) throws IOException {

		int byteCount = 0;
		int charCount = 0;
		int lineCount = 0;
		String str;

		FileReader fr = new FileReader("c:\\javawork\\Sample.txt");
		BufferedReader br = new BufferedReader(fr);
		while ((str = br.readLine()) != null) {
			lineCount += 1;
			charCount += str.length();
			byteCount += str.getBytes().length;
		}
		br.close();
		fr.close();
		System.out.println(lineCount + "列資料");
		System.out.println(charCount + "個字元");
		System.out.println(byteCount + "個位元組");

	}

}
