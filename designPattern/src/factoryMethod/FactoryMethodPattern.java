package factoryMethod;

// 부모클래스에 알려지지 않은 구체 클래스를 생성하는 패턴
// 자식 클래스가 어떤 객체를 생성할지를 결정하도록 하는 패턴
// 부모클래스 코드에 구체 클래스 이름을 감추기 위한 방법으로 사용

public class FactoryMethodPattern {
	public static void main(String[] args) {
		// 요구사항 ) 게임 아이템과 생성을 구현
		//			아이템 생성 전 db에서 아이템정보를 요청
		// 			아이템 생성 후 db에 아이템 생성정보를 남김
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create(); // 부모클래스는 어떤 item이 생성되는지 모른다.
		creator = new MpCreator();
		creator.create();
	}
}
