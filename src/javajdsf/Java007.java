package javajdsf;
//�޷�����ո����
//�޷�ʵ�ֶԿո���жϰ�
import java.util.Scanner;

public class Java007 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����ַ�:");
		String inputs = input.next();
		input.close();
		System.out.println(inputs);// ��ӡ�⴮�ַ�
		int theletter = 0;
		int space = 0;
		int digital = 0;
		int other = 0;
		if (inputs.length() > 0) {
			for (int i = 0; i < inputs.length(); i++) {
				inputs.charAt(i);
				if ((inputs.charAt(i) >= 'a' && inputs.charAt(i) <= 'z')
						|| inputs.charAt(i) >= 'A' && inputs.charAt(i) <= 'Z') {
					theletter++;
				} else if (inputs.charAt(i) == ' ') {
					space++;
				} else if (inputs.charAt(i) >= '0' && inputs.charAt(i) <= '9') {
					digital++;
				} else {
					other++;
				}

			}

			System.out.println("Ӣ����ĸ������" + theletter);
			System.out.println("�ո������" + space);
			System.out.println("���ָ�����" + digital);
			System.out.println("����" + other);
		} else {
			System.out.println("��û�������ַ���");
		}
	}
}
