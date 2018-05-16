package javaoop;

public class MyTimeClass {

	private int hour;
	private int min;
	private int sec;

	void addSecond(int sec) {
	}

	void addMinute(int min) {
	}

	void addHour(int hou) {
	}
	//----------------------------------

	void subSecond(int sec) {
	}

	void subMinute(int min) {
	}

	void subHour(int hou) {
	}

	void display() {
		System.out.println("当前时间：" + hour + ":" + min + ":" + sec);

		System.out.println();
	}

	// ----------------------------------------------
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

}
