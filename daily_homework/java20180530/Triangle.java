package java20180530;

public class Triangle {
	private float a;
	private float b;
	private float c;

	Triangle() {

	}

	Triangle(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	double P() {
		double s = a + b + c;
		return s;
	}

	double S() {
		return Math.sqrt((P() / 2 - this.a) * (P() / 2 - this.b) * (P() / 2 - this.c) * (P() / 2));
	}

	double jiao(String A) {

		return 1;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

}
