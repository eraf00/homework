package javaoop;

public class GuessingGameClass {
	  private int v = 50;

	  public void guess(int num) {
	    if (v > num) {
	      System.out.println("�������ֵС�ˣ�");
	    } else if (v < num) {
	      System.out.println("�������ֵ���ˣ�");
	    } else if (v == num) {
	      System.out.println("������ȷ��");
	    }
	  }
}
