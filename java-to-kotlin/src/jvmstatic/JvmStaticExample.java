package jvmstatic;

public class JvmStaticExample {
	public static void main(String[] args) {
		// String hello = HelloClass.Companion.hello();
		// String hi = HiObject.INSTANCE.hi();

		// @JvmStatic 추가할 경우 아래와 같이 사용가능
		HelloClass.hello();
		HiObject.hi();
	}
}

