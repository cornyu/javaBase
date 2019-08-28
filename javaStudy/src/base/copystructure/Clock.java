package base.copystructure;

/**
 * @author cornyu
 * @version 创建时间：2018年4月27日 下午8:40:14 
 * 
 * 拷贝构造函数 测试
 * 
 */
public class Clock {
	
	private int hour;
	private int minute;
	private int second;

	public Clock() {
		setTime(0, 0, 0);
	}

	public Clock(int h, int m, int s) {
		setTime(h, m, s);
	}

	/* 拷贝构造函数 */
	public Clock(Clock clock) {
		this.hour = clock.hour;
		this.minute = clock.minute;
		this.second = clock.second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setTime(int h, int m, int s) {
		if (h >= 0 && h < 24)
			this.hour = h;
		else
			this.hour = 0;

		if (m >= 0 && m < 60)
			this.minute = m;
		else
			this.minute = 0;

		if (s >= 0 && s < 60)
			this.second = s;
		else
			this.second = 0;
	}

	public void printTime() {
		if (this.hour < 10)
			System.out.print("0");
		System.out.print(this.hour + ":");

		if (this.minute < 10)
			System.out.print("0");
		System.out.print(this.minute + ":");

		if (this.second < 10)
			System.out.print("0");
		System.out.println(this.second);
	}
}
