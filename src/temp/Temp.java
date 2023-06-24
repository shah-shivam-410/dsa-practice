package temp;

import java.io.File;

public class Temp {

	public static void main(String[] args) {

		File filePath = new File("E:\\ChatGPT-docs");
		File[] listFiles = filePath.listFiles();
		for (File f : listFiles) {
			if (!f.isDirectory()) {
				System.out.println(f.getName());
			}
		}

	}

}
