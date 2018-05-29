package Test;

public class Java02 {
public static void main(String[] args) {
	for(int i=0;i<10000;i++) {
		for(int a=0;a<17;a++) {
			if(i%8==1&&(i/8)%8==1&&((i/8)/8)/8==a&&i%17==4&&(i/17)%17==15&&(i/17)/17==2*a)System.out.print("这个自然数是:"+i);
		}
	}
}
}
