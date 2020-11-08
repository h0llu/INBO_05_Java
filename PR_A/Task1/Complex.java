package Task1;

public class Complex {
	private final int real, image;

	public Complex() {
		this.real = 0;
		this.image = 0;
	}

	public Complex(int real, int image) {
		this.real = real;
		this.image = image;
	}

	public Complex(Complex z) {
		this.real = z.real;
		this.image = z.image;
	}

	public int real() {
		return this.real;
	}

	public int image() {
		return this.image;
	}

	public double absoluteValue() {
		return Math.sqrt(real * real + image * image);
	}

	public double argument() {
		if (this.real > 0) {
			return Math.atan(this.image/(double)this.real);
		}
		else if (this.real < 0) {
			return Math.atan(this.image/(double)this.real) + Math.PI;
		}
		else if (this.real == 0) {
			return Math.signum(this.image) * Math.PI / 2;
		}
		return 0;
	}

	public Complex conjugate() {
		return new Complex(this.real, -this.image);
	}

	public Complex add(Complex z) {
		return new Complex(this.real + z.real, this.image + z.image);
	}

	public Complex substract(Complex z) {
		return new Complex(this.real - z.real, this.image - z.image);
	}

	public Complex multiplyBy(Complex z) {
		return new Complex(this.real * z.real - this.image * z.image,
				         this.image * z.real + this.real * z.image);
	}

	public Complex divideBy(Complex z) {
		int real = (this.real + z.real + this.image + z.image) / (z.real * z.real + z.image * z.image);
		int image = (z.real * this.image - this.real * z.image) / (z.real * z.real + z.image * z.image);

		return new Complex(real, image);
	}
}