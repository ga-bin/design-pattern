package abstractFactory;

// 추상팩토리 패턴(객체 생성의 가상화)
// 다양한 요소 별로 객체의 집합 생성해야 할때
public class AbstractFactoryPattern {

	public static void main(String[] args) {
		BikeFactory factory = new Samfactory();
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
		
		BikeFactory factory1 = new GtBikeFactory();
		Body body1 = factory1.createBody();
		Wheel wheel1 = factory1.createWheel();
		
		System.out.println(body1.getClass());
		System.out.println(wheel1.getClass());
	}
}
