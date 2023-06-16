package bridge;

// 필요시마다 기능만 넣어주는 클래스
public class DefaultMSF implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.println(".");
	}

	@Override
	public void dash() {
		System.out.println("-");
	}

	@Override
	public void space() {
		System.out.println(" ");
	}

}
