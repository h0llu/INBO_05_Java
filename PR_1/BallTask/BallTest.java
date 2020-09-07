package Ball_Task;


public class BallTest {
	public static void main(String[] args) {
		Ball b1 = new Ball("Red", 2);
		Ball b2 = new Ball("Black");
		Ball b3 = new Ball();
		b2.setDiameter(4);
		System.out.println(b1);
		System.out.println(b2);
		b2.setColor("Orange");
		System.out.println(b2.getColor());
		System.out.println(b3);
	}
}
