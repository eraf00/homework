package work;

public class Work_05 {
	public static void main(String[] args) {
		int i=1;float sum=0;
		do {
			if(i%5==0) {sum+=-3.5;System.out.println("��"+i+"�컨ȥ6Ԫ��߀ʣ"+sum+"Ԫ");i++;
			}else {sum+=2.5;i++;}
			
		}while(sum<=100);
		i=i-1;
		System.out.println("Ҫ���^�B�m�惦"+i+"�죬���ܴ���100Ԫ��");
	}}