package strategy;

public class GameCharacter {

	// 접근점
	private Weapon weapon;
	
	// 교환기능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		// 델리케이트 : 내가 어떤 것을 들고있느냐에 따라서 출력이 다르다
		// 출력과 관련된 전략을 다른 클래스에게 맡기는 방법
		weapon.attack();
	}
}
