package Task1;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1 = new Person("Петров");
		Person p2 = new Person("Васильев", "Иван", "Иванович");
		Person p3 = new Person("Иванов", "Пётр");
		System.out.println(p1.returnFullName());
		System.out.println(p2.returnFullName());
		System.out.println(p3.returnFullName());
	}
}