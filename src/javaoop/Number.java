package javaoop;

public class Number {
	  private int n1;
	  private int n2;

	  public Number(int n1, int n2) {
	    this.n1 = n1;
	    this.n2 = n2;
	  }

	  public int addition() {
	    return n1 + n2;
	  }

	  public int subtration() {
	    return n1 - n2;
	  }

	  public int multiplication() {
	    return n1 * n2;
	  }

	  public int division() {
	    // 判断 n2 != 0
	    if (n2 != 0) {
	    	   return n1 / n2;
	    }else
	      System.out.println("���� ����Ϊ0");
		return n1;
	  }
}
