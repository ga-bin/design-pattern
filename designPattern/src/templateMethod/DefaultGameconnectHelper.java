package templateMethod;

public class DefaultGameconnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		// 추가요청사항
		System.out.println("강화된 알고리즘");
		System.out.println("디코드");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디 암호 확인과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// 추가요청 10시 이후
		System.out.println("서버에서 나이를 불러와 확인 후 시간과 비교");
		System.out.println("권한 확인");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속 단계");
		return info;
	}

}
