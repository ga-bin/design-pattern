package templateMethod;

// 템플릿
public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String string);
	
	protected abstract boolean authentication(String id, String password);
	
	protected abstract int authorization(String userName);
	
	protected abstract String connection(String info);
	
	// 템플릿 메소드
	public String requestConnection(String encodedInfo) {
		// 보안작업 -> 암호화된 문자열을 디코드
		String decodedInfo = doSecurity(encodedInfo);
		// id와 password는 디코딩한 것을 수신했다고 가정한다.
		// 반환된 것으로 id와password를 받는다.
		String id = "aa";
		String password = "bbb"; 
		
		if(!authentication(id, password)) {
			System.out.println("암호 불일치");
		}
		
		String userName = "userName";

		// 인증 성공시 권한 획득
		int i = authorization(userName);
		
		switch(i) {
		case -1:
				throw new Error("10시 셧다운");
		case 0: 
				System.out.println("게임매니저임");
				break;
		case 1:
				System.out.println("유료회원");
				break;
		case 2:
				System.out.println("무료회원");
				break;
		case 3:
				System.out.println("권한없음");
				break;
		default:
				System.out.println("기타사항");
				break;
		}
		return connection(userName);
	}
}
