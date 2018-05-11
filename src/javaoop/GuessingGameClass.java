package javaoop;

public class GuessingGameClass {
	  private int v = 50;

	  public void guess(int num) {
	    if (v > num) {
	      System.out.println("你输入的值小了！");
	    } else if (v < num) {
	      System.out.println("你输入的值大了！");
	    } else if (v == num) {
	      System.out.println("输入正确！");
	    }
	  }
}
