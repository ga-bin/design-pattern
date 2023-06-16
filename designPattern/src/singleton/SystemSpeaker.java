package singleton;

public class SystemSpeaker {
	static private SystemSpeaker instance;
	private int volume;
	private SystemSpeaker() {
		setVolume(5);
	}
	
	public static SystemSpeaker getInstance() {
		if(instance == null) {
			// 시스템의 스피커에 접속
			instance = new SystemSpeaker();
			// 추가요청
			System.out.println("새로생성");
		}
		
		// 추가요청
		System.out.println("이미생성");
		return instance;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
