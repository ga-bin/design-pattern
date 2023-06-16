package prototype;

// 무조건 cloneable 구현해서 사용해야한다.
public class Shape implements Cloneable {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
