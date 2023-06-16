package adapter;

public class adapterPattern {

	// 클래스의 인터페이스를 사용자가 기대하는 다른 인터페이스로 변환하는 패턴
	// 호환성이 없는 인터페이스 때문에 함께 동작할 수 없는 클래스들이 함께 작동하도록 해준다
	
	public static void main(String[] args) {
		AdapterImpl adapter = new AdapterImpl();
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(80f));
	}
}
