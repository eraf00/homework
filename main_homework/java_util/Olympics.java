package java_util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Olympics {
	public static void main(String[] args) {
		List<String> ranks = new ArrayList<>();
		String[] rank16 = { "rank01", "rank02", "rank03", "rank04", "rank05", "rank06", "rank07", "rank08", "rank09",
				"rank10", "rank11", "rank12", "rank13", "rank14", "rank15", "rank16" };
		for (int i = 0; i < 16; i++)
			ranks.add(rank16[i]);

		Collections.shuffle(ranks);
		String[] groups= {"第一组","第二组","第三组","第四组"};
		System.out.print("分组情况：");
		for (int i = 0,j=0; i < ranks.size(); i++) {// 摸牌
			if(i%4==0)System.out.print("\n"+groups[j++]+":\t");
			System.out.print(ranks.get(i)+"\t");
		}
	}
}
