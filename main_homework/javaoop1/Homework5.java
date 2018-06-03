package javaoop1;

public class Homework5 {

	public static void main(String[] srgs) {
		BoxWeight box1 = new BoxWeight();
		box1 = new BoxWeight(30, 10, 10, 34);
		System.out.println("盒子box1的体积:" + (box1.getWidth() * box1.getHeight() * box1.getDepth()));
		System.out.println("盒子box1的重量:" + box1.getWeight());

		BoxWeight box = new BoxWeight(30, 10, 10, 34);
		System.out.println("盒子box1的体积:" + (box.getWidth() * box.getHeight() * box.getDepth()));
		box = new BoxWeight();
	}
}
