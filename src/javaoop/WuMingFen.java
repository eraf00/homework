package javaoop;

public class WuMingFen {
	private String theMa = "����";
	private int quantity = 2;
	private boolean likeSoup = true;

	// -----------------
	public WuMingFen() {
		this.theMa = "����";
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
    System.out.println("����:"+this.theMa+"\n������"+this.quantity +"\n������"+likeSoup+"\n");
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
