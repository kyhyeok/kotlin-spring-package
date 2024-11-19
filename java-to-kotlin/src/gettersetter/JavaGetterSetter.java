package gettersetter;

import java.time.LocalDate;

public class JavaGetterSetter {
	public static void main(String[] args) {
		Student student = new Student();

		// student.setName("스티브로저스");
		// System.out.println(student.getName());

		// @JvmField를 애노테이션을 사용할 경우 코틀린의 프로퍼티로 접근해야 한다.
		student.name = "스티브로저스";
		System.out.println(student.name);

		student.setBirthDate(LocalDate.of(1918, 7, 4));
		System.out.println(student.getBirthDate());

		// student.setAge(10); 불변인 val이라서 setter 불가
		System.out.println(student.getAge());

		// student.setGrade(10); set을 활용한 변경 불가
		student.changeGrade("A");
		System.out.println(student.getGrade());


	}
}
