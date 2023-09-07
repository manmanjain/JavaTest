package homework7;

import java.io.*;

public class CopyFile {
	
	public static void main(String[] args) {
		String sourceFile = "c:\\javawork\\source.txt";
		String targetFile = "c:\\javawork\\target.txt";
		
		try {
			copyFile(sourceFile,targetFile);
			System.out.println("檔案複製成功");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("檔案複製失敗");
		}
		
	}
	
	public static void copyFile(String sourceFile,String targetFile) throws IOException {
		File inputFile = new File(sourceFile);
		File outputFile = new File(targetFile);
		
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int content;
		
		while((content=in.read()) != -1) {
			out.write(content);
			//System.out.println((char)content);
			System.out.flush();
		}
		in.close();
		out.close();
	}

}
