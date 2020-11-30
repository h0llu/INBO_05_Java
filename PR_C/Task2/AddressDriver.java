package Task2;

public class AddressDriver {
	public static void main(String[] args) {
		String address1 = "Россия,Москва,Москва,Проспект Вернадского,78,А,Г-426";
		String address2 = "Россия;Москва;Москва;Проспект Вернадского;78;А;Г-426";
		String address3 = "Россия.Москва.Москва.Проспект Вернадского.78.А.Г-426";
		String address4 = "Россия-Москва-Москва-Проспект Вернадского-78-А-Г426";
		System.out.println(new Address(address1));
		System.out.println(new Address(address2, ";"));
		System.out.println(new Address(address3, "."));
		System.out.println(new Address(address4, "-"));
	}
}