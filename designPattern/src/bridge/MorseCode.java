package bridge;

public class MorseCode {

	// 만약에 defaultMsf를 그대로 가지고 오면 수정시마다 코드로와서 구현을 바꿔야하기 때문에 인터페이스로 morsecodefunction을 둔 것
	
	private MorseCodeFunction function;
	public void dot() {
		function.dot();
	}
	
	public void dash() {
		function.dash();
	}
	
	public void space() {
		function.space();
	}

	public MorseCodeFunction getFunction() {
		return function;
	}

	public void setFunction(MorseCodeFunction function) {
		this.function = function;
	}
	

}
