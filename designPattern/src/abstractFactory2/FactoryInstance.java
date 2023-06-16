package abstractFactory2;

// 콘크리트 패키지 - 외부에 유출되면 안됨

public class FactoryInstance {
	public static GuiFac getGuiFac() {
		switch(0) {
			case 0 : return new WindowFac();
			case 1 : return new LinuxGuiFac();
			// 구현된 내용을 알수 없음
		}
		return null;
	}
}
