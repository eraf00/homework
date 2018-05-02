package work;

public class Work_05 {
	public static void main(String[] args) {
		int i=1;float sum=0;
		do {
			if(i%5==0) {sum+=-3.5;System.out.println("第"+i+"天花去6元，還剩"+sum+"元");i++;
			}else {sum+=2.5;i++;}
			
		}while(sum<=100);
		i=i-1;
		System.out.println("要經過連續存儲"+i+"天，才能存上100元！");
	}}