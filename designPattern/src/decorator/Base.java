package decorator;

// 실질적인 책임의 추제
public class Base implements IBeverage {

	// 아무것도 없는 상태에서는 가격이 산출되지 않음
	@Override
	public int getTotalPrice() {
		return 0;
	}

}
