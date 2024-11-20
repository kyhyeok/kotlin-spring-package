package exception;

import java.io.FileWriter;
import java.io.IOException;

public class JavaTryWithResources {

	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter("test.txt")) {
			writer.write("hello Java");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
