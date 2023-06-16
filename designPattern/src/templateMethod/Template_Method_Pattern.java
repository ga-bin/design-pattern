package templateMethod;

// 알고리즘을 변경하지 않고 알고리즘의 특정 단계들을 다시 정의
// 구현하려는 알고리즘이 일정한 프로세스가 있고, 변경가능성이 있는 경우 사용한다.
// 1. 알고리즘을 여러 단계로 나눈다.
// 2. 나눠진 알고리즘 단계를 메소드를 선언한다.
// 3. 알고리즘을 수행할 템플릿 메소드를 만든다.
// 4. 하위클래스에서 나눠진 메소드들을 구현한다.
public class Template_Method_Pattern { // 원래는 다른 패키지에서 가지고 와야 한다.
	public static void main(String[] args) {
		// 요구사항(접속시 보안 인증 권한 접속 과정으로 나눠서 접근해야 한다.
		AbstGameConnectHelper helper = new DefaultGameconnectHelper();
		helper.requestConnection("idandpassword");
		// 추가요구사항 : 보안강화 + 10시 셧다운
	}
	
}
