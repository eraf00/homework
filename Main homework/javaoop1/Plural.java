package javaoop1;

public class Plural {
	private double real;
	private double thefalse;

	Plural() {
		this.real = 0;
		this.thefalse = 0;
	}

	Plural(double real, double thefalse) {
		this.real = real;
		this.thefalse = thefalse;

	}

	void add(Plural a, Plural b) {
		System.out.println((a.real + b.real) + "+" + (a.thefalse + b.thefalse) + "i");
	}

	void reduce(Plural a, Plural b) {
		System.out.println((a.real - b.real) + "+" + (a.thefalse - b.thefalse) + "i");
	}

	void ride(Plural a, Plural b) {
		System.out.println(
				(a.real * b.real - a.thefalse * b.thefalse) + "+" + (a.real * b.thefalse + a.thefalse * b.real) + "i");
	}

	void except(Plural a, Plural b) {
		if (b.real != 0 && b.thefalse != 0)
			System.out.println((a.real * b.real + a.thefalse * b.thefalse) / (b.real * b.real + b.thefalse * b.thefalse)
					+ "+" + (a.real * b.thefalse - a.thefalse * b.real) / (b.real * b.real + b.thefalse * b.thefalse)
					+ "i");
		else
			System.out.println("´íÎó£¡");
	}

	// --------------------
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getThefalse() {
		return thefalse;
	}

	public void setThefalse(double thefalse) {
		this.thefalse = thefalse;
	}

}
