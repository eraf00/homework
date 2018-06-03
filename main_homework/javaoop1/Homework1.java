package javaoop1;

public class Homework1 {
	public static void main(String[] args) {
		CarHonda a1 = new CarHonda();
		System.out.println("第一辆车的详细信息如下：\n生产厂家：" + a1.getProduce());
		a1.showColor();
		a1.showModel();
		CarHonda a2 = new CarHonda("银白色");
		System.out.println("\n第二辆车的详细信息如下：\n生产厂家：" + a2.getProduce());
		a2.showColor();
		a2.showModel();

		CarHonda a3 = new CarHonda("蓝色", "卡车", "天津一汽");

		System.out.println("\n第三辆车的详细信息如下：\n生产厂家：" + a3.getProduce());
		a3.showColor();
		a3.showModel();
	}
}