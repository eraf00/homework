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
	// -------------------------------

	Plural add(Plural a, Plural b) {
		Plural c = new Plural((a.real + b.real), (a.thefalse + b.thefalse));
		return c;
		// System.out.println("a + b=" + (a.real + b.real) + "+" + (a.thefalse +
		// b.thefalse) + "i");

	}

	Plural reduce(Plural a, Plural b) {
		Plural c = new Plural((a.real - b.real), (a.thefalse - b.thefalse));
		return c;

		// System.out.println("a - b=" + (a.real - b.real) + "+" + (a.thefalse -
		// b.thefalse) + "i");
	}

	Plural ride(Plural a, Plural b) {
		if (b.real != 0 || b.thefalse != 0) {
			Plural c = new Plural((a.real * b.real - a.thefalse * b.thefalse),
					(a.real * b.thefalse + a.thefalse * b.real));
			return c;
			// System.out.println("a * b=" + (a.real * b.real - a.thefalse * b.thefalse) +
			// "+"
			// + (a.real * b.thefalse + a.thefalse * b.real) + "i");
		} else {
			Plural c = new Plural(0, 0);
			// System.out.println("a * b=0");
			return c;
		}
	}

	Plural except(Plural a, Plural b) {
		if (b.real != 0 || b.thefalse != 0) {
			Plural c = new Plural(
					(a.real * b.real + a.thefalse * b.thefalse) / (b.real * b.real + b.thefalse * b.thefalse),
					(a.real * b.thefalse - a.thefalse * b.real) / (b.real * b.real + b.thefalse * b.thefalse));
			return c;
			/*
			 * System.out.println("a / b=" + (a.real * b.real + a.thefalse * b.thefalse) /
			 * (b.real * b.real + b.thefalse * b.thefalse) + "+" + (a.real * b.thefalse -
			 * a.thefalse * b.real) / (b.real * b.real + b.thefalse * b.thefalse) + "i");
			 */
		} else {
			return new Plural();
		}
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
