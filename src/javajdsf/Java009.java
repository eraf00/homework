package javajdsf;

public class Java009 {
	public static void main(String[] srgs) {
		for (int figure = 1; figure < 1000; figure++) {// 一到1000的数字循环
			int[] factor = new int[figure];// 创建一个因子库
			int a = 0, z = 0, n = 0;
			for (int i = 1; i < figure; i++) {// 提取因子
				if (figure % i == 0) {
					n++;
					factor[n] = i;
				}
			}
			for (; z <= n; z++) {// 因子库所有内容的乘积
				a += factor[z];

			}
			if (figure == a) {// 输出完数
				System.out.print(" " + figure + ";");
			}
		}
	}
}
