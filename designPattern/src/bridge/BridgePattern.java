package bridge;

// 구현부에서 추상층을 분리하여 각자 독립적으로 변경할 수 있게 하는 패턴
public class BridgePattern {

	// 어댑터 패턴과 브릿지 패턴을 연결하여 이해(어댑터패턴과 흡사)
	// 기능부분과 구현 부분을 분리
	// 모스부호를구현
	
	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode(new DefaultMSF());
		code.g().a().r().a().m();
	}
}
