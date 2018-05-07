package java20180507;
//井底之蛙
public class TunnelVision {

	static void main(String[] srgs) {
int frog=0;//青蛙
int day=0;
while(frog<=7) {
	frog+=3;
	day++;
	if(frog>=7) {
		break;
	}
	frog-=2;
}System.out.print("青蛙"+day+"天可以爬出这口井");



}}
