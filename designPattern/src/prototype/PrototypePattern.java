package prototype;

// 생성할 객체들의 타입이 프로토타입인 인스턴스로 부터 결정되도록
// 인스턴스를 새 객체를 만들기 위해 자신을 복제
// 사용상황 1. 생산비용이 높은 인스턴스를 사용하는 경우
//        2. 종류가 너무 많아서 클래스로 정리되지 않는 경우
//        3. 클래스로부터 인스턴스 생성이 어려운 경우
public class PrototypePattern {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// 축다요청 복사를 하면 도형이 겹치므로 안겹치도록 살짝 이동 요청
		Circle circle1 = new Circle(1, 1, 3);
		Circle circle2 = circle1.copy();
		System.out.println(circle1.getX() + "," + circle1.getY() + "," + circle1.getR());
		System.out.println(circle2.getX() + "," + circle2.getY() + "," + circle2.getR());
	}
}
