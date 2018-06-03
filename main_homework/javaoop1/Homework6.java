package javaoop1;

public class Homework6 {

	public static void main(String[] srgs) {
		Plural a = new Plural(2, 4);
		Plural b = new Plural(1, 2);
		System.out.println("复数a的值是：" + show(a));
		System.out.println("复数b的值是：" + show(b));
		System.out.println("(a+b)=" + show(a.add(a, b)));
		System.out.println("(a-b)=" + show(a.reduce(a, b)));
		System.out.println("(a*b)=" + show(a.ride(a, b)));
		System.out.println("(a/b)=" + show(a.except(a, b)));
	}

	static String show(Plural a) {
		if (a.getReal() == 0 && a.getThefalse() == 0)
			return "0";
		else if (a.getReal() == 0 && a.getThefalse() != 0)
			return (a.getThefalse() + "i");
		else if (a.getThefalse() != 0 && a.getThefalse() == 0)
			return (a.getReal() + "");
		else
			return (a.getReal() + "+" + (a.getThefalse() + "i"));
	}
}