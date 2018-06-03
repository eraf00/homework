package javaoop;

public class WuMingFen {
	private String theMa = "酸辣";
	private int quantity = 2;
	private boolean likeSoup = true;

	// -----------------
	public WuMingFen() {
		this.theMa = "酸辣";
		this.quantity = 2;
		this.likeSoup = true;
	}
	// -----------------------

	public WuMingFen(String theMa, int quantity) {
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = true;
	};

	// ----------------------------
	public WuMingFen(String theMa, int quantity, boolean likeSoup) {
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
public void check(){
    System.out.println("面码:"+this.theMa+"\n分量："+this.quantity +"\n带汤："+likeSoup+"\n");
}
	// ----------------------------------------------------
	public String getTheMa() {
		return theMa;
	}

	public void setTheMa(String theMa) {
		this.theMa = theMa;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isLikeSoup() {
		return likeSoup;
	}

	public void setLikeSoup(boolean likeSoup) {
		this.likeSoup = likeSoup;
	}
}
