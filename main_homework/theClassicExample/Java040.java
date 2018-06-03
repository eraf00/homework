package theClassicExample;

public class Java040 {
	public static void main(String[] args) {
		System.out.println("原来最少有" + taozi());
		System.out.println("第一个猴子分完之后" + houzi(taozi()));
		System.out.println("第二个猴子分完之后" + houzi(houzi(taozi())));
		System.out.println("第三个猴子分完之后" + houzi(houzi(houzi(taozi()))));
		System.out.println("第四个猴子分完之后" + houzi(houzi(houzi(houzi(taozi())))));
		System.out.println("第五个猴子分完之后" + houzi(houzi(houzi(houzi(houzi(taozi()))))));
		System.out.println("如果再分" + houzi(houzi(houzi(houzi(houzi(houzi(taozi())))))));

	}

	static float houzi(float taozi) {
		taozi = ((taozi - 1) / 5) * 4;
		return taozi;// 3121
	}

	static float taozi() {
		float taozi = 0;
		int j = 0;
		for (; j < 1000000; j++) {
			taozi = j;
			for (int i = 0; i < 5; i++) {
				taozi = (taozi * 5) / 4 + 1;
			}
			if (taozi == (int) taozi)
				break;

		}
		return taozi;// 3121

	}
}

// (taozi-1)/5;taozi=(taozi-1)*(4/5)新桃子等于旧桃子-1
// 5猴子5+1个桃子
// （）四猴子桃子-1） ： 6=1：4