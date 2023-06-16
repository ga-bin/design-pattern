package singleton;

public class SingletonPattern {
	public static void main(String[] args) {
		// 요구사항 ) 개발중인 시스템 스피커에 접근할 수 있는 클래스 만들기 
		// 			100개의 스피커 모두 볼륨올리기
		// 추가요청사항 ) 인스턴스 추가시마다 로그를 찍음
		// 			  new로하면 안됨
		
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker2.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
	}
}
