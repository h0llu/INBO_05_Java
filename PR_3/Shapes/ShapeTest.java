package Shapes;

public class ShapeTest {
	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "RED", false);
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		System.out.println(s1.getRadius()); /* ошибка компиляции, т.к. в Shape нет метода getRadius() */

		Circle c1 = (Circle)s1;
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius()); /* тут ошибки уже нет, т.к. c1 - ссылка на Circle, а не на Shape */

		Shape s2 = new Shape(); /* создать экземпляр абстрактного класса нельзя */

		Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		System.out.println(s3.getLength()); /* в Shape нет метода getLength() */

		Rectangle r1 = (Rectangle)s3;
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength()); /* ошибки нет, т.к. r1 - ссылка на Rectangle */

		Shape s4 = new Square(6.6);
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		System.out.println(s4.getSide()); /* в Shape нет метода getSide() */

		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getSide()); /* в Rectangle тоже нет такого метода */
		System.out.println(r2.getLength());

		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide()); /* в Square такой метод есть, поэтому ошибка не возникает */
		System.out.println(sq1.getLength());
	}
}
