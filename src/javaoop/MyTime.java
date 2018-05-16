package javaoop;

public class MyTime {

	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void display() {
		System.out.print("现在时间是：" + hour + ":" + minute + ":" + second);
	}

	void addSecond(int sec) {
		this.second += sec;
		if (second > 59) {
			second -= 60;
			minute++;
			if (minute > 59) {
				minute -= 60;
				second++;
				if (hour > 24) {
					hour -= 24;
				}
			}
		}
	}

	void addMinute(int min) {
		if (minute > 59) {
			minute -= 60;
			second++;
			if (hour > 24) {
				hour -= 24;
			}
		}
	}

	void addHour(int hou) {
		if (hour > 24) {
			hour -= 24;
		}
	}

	void subSecond(int sec) {
		this.second -= sec;
		second += 60;
		minute--;
		if (minute < 0) {
			minute += 60;
			second--;
			if (hour < 0) {
				hour += 24;
			}
		}
	}

	void submMinute() {
		if (minute < 0) {
			minute += 60;
			second--;
			if (hour < 0) {
				hour += 24;
			}
		}
	}

	void subHour(int hou) {
		if (hour < 0) {
			hour += 24;
		}
	}
}