package java20180507;

//���б���
public class BankPrincipal {
	public static void main(String[] args) {
		float principal = 10000;
		for (int year = 1; year <= 5; year++) {
			principal += 0.003 * principal;
		}
		System.out.print("����󣬻�õı�����" + principal);
	}
}
