package adapter;

// 기존클래스
public class Math {
	public static double twoTime(double num) {
		return num * 2;
	}
	
	public static double half(double num) {
		return num / 2;
	}
	
	// 강화된 알고리즘(알고리즘이 바꼈다고 가정)
	public static Double doubled(Double d) {
		return d * 2;
	}
}
