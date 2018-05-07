package java20180507;

//银行本金
public class BankPrincipal {
	public static void main(String[] args) {
		float principal = 10000;
		for (int year = 1; year <= 5; year++) {
			principal += 0.003 * principal;
		}
		System.out.print("五年后，获得的本金是" + principal);
	}
}
