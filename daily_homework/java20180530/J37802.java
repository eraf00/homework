package java20180530;

public class J37802 {
	public static void main(String[] args) {
		Triangle z = new Triangle(3, 4, 5);
		float P = z.getA() + z.getB() + z.getC();
		double S = Math.sqrt((P / 2 - z.getA()) * (P / 2 - z.getB()) * (P / 2 - z.getC()) * (P / 2));
		System.out.println("三角形【a=" + z.getA() + "，b=" + z.getB() + "，c=" + z.getC() + "】");
		System.out.println("周长：" + P);
		System.out.println("面积：" + S);
		System.out.println("角A=" + Math.toDegrees((Math.acos(
				(Math.pow(z.getB(), 2) + Math.pow(z.getC(), 2) - Math.pow(z.getA(), 2)) / (2 * z.getB() * z.getC())))));
		System.out.println("角B=" + Math.toDegrees((Math.acos(
				(Math.pow(z.getA(), 2) + Math.pow(z.getC(), 2) - Math.pow(z.getB(), 2)) / (2 * z.getA() * z.getC())))));
		System.out.println("角C=" + Math.toDegrees((Math.acos(
				(Math.pow(z.getA(), 2) + Math.pow(z.getB(), 2) - Math.pow(z.getC(), 2)) / (2 * z.getA() * z.getB())))));
	}
}