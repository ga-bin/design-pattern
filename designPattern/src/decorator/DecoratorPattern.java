package decorator;

import java.util.Scanner;

// 주어진 상황 및 용도에 따라 어떤 객체에 책임을 덧붙이는 패턴
// 기능 확자잉 필요할 떄 서브 클래싱 대신 쓸 수 있는 유연한 대안
// 동적으로 책임 추가가 필요할 때

public class DecoratorPattern {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IBeverage beverage = new Base();
		boolean done = false;
		while(!done) {
			System.out.println("음료 현재 가격" + beverage.getTotalPrice());
			System.out.println("선택 : 1샷추가 / 2: 우유 추가");
			switch (scan.nextInt()) {
			case 0:
				done = true;
				break;
			case 1:
				beverage = new Espresso(beverage);
				break;
			case 2:
				beverage = new Milk(beverage);
				break;
			}
		}
		System.out.println("음료가격 : " + beverage.getTotalPrice());
		scan.close();
	}
}
