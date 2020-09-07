package BallTask;

public class TestBall {
	public static void main(String[] args) {
		Ball b1 = new Ball(150, 0);
		System.out.println(b1);
		b1.move(-30, 300);
		System.out.println(b1);
	}
}
