package decorator;

public class AbstAding implements IBeverage {

	private IBeverage base;
	
	public AbstAding(IBeverage base) {
		super();
		this.base = base;
	}
	
	protected IBeverage getBase() {
		return base;
	}
	
	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}
	
}
