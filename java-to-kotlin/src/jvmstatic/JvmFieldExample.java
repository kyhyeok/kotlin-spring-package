package jvmstatic;

public class JvmFieldExample {
	public static void main(String[] args) {
		// int id = JvmFieldClass.Companion.getId();
		// String name = JvmFieldObject.INSTANCE.getName();

		// @JvmFiled 추가할 경우 아래와 같이 사용가능
		int id = JvmFieldClass.id;
		String name = JvmFieldObject.name;

		int code = JvmFieldClass.CODE;
		String familyName = JvmFieldObject.FAMILY_NAME;
	}
}
