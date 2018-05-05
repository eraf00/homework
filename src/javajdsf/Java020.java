package javajdsf;

public class Java020 {

	public static void main(String[] args) {
int i;float[] a=new float[20];a[0]=1;float sum=0;
for(i=0;i<20;i++) {
	a[i+1]=a[i]+a[i-1];
	sum+=a[i+1]/a[i];
}
System.out.println(sum);
}}
