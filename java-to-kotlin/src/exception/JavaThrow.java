package exception;

import java.io.IOException;

public class JavaThrow {
	public void throwIOException() throws IOException {
		throw new IOException("체크드 익셉션인 IOException 발생");
	}

	public static void main(String[] args) {
		// JavaThrow javaThrow = new JavaThrow();
		// try {
		// 	javaThrow.throwIOException();
		// } catch (IOException e) {
		// 	e.printStackTrace();
		// }

		KotlinThrow kotlinThrow = new KotlinThrow();
		// kotlinThrow.throwIOException();

		// @Throws(IOException::class)를 통한 예외 전파를 해서 try catch 가능
		try {
			kotlinThrow.throwIOException();
		} catch (IOException e) {

		}

	}
}
