package factoryMethod;

// template method pattern처럼 됨
public abstract class ItemCreator {
	public Item create() {
		Item item;
		requestItemInfo();
		item = createItem();
		createItemLog();
		
		return item;
	}
	
	// 아이템 생성전 아이템 정보를 요청
	abstract protected void requestItemInfo();
	
	// 아이템 정보 남김
	abstract protected void createItemLog();
	
	// 아이템을 생성하는 알고리즘
	abstract protected Item createItem();
}
