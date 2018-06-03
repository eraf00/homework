package java20180507;
//井底之蛙
public class TunnelVision20180507 {

	static void main(String[] srgs) {
int frog=0;//青蛙
int day=0;
while(true) {
	frog+=3;
	day++;
	if(frog>=7) {
		break;
	}
	frog-=2;
}System.out.print("青蛙"+day+"天可以爬出这口井");



}}
