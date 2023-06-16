package factoryMethod;

import java.util.Date;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemInfo() {
		System.out.println("db에서 마력 회복 물약의 정보를 가져옴");
	}

	@Override
	protected void createItemLog() {
		System.out.println("마력 회복 물약을 새로 생성했습니다" + new Date(0));
	}

	@Override
	protected Item createItem() {
		// 작업
		return new MpPotion();
	}

}
