package extensions;

public class ExtensionExample {
	public static void main(String[] args) {
		// "ABCD".first();
		// "ABCD".addFirst('Z');
		char first = MyExtentionsKt.first("ABCD");
		System.out.println(first);
		String addFirst = MyExtentionsKt.addFirst("ABCD", 'Z');
		System.out.println(addFirst);
	}
}
