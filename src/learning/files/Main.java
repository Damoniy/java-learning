package learning.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String path = "c:\\temp\\in.txt";
		FileReader reader = null;
		BufferedReader bf = null;
		
		try {
			reader = new FileReader(path);
			bf = new BufferedReader(reader);
			
			String line = bf.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if(reader != null) {
					reader.close();
				}
				if(bf != null) {
					bf.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
