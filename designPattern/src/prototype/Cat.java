package prototype;

public class Cat implements Cloneable {
	private String name;
	private Age age;
	
	public Cat copy() throws CloneNotSupportedException {
		Cat ret = (Cat) this.clone();
		// 깊은복사 출력예시는 이렇게
		// ret.setAge(new Age(this.age.getYear(), this.age.getValue()));
		return ret;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Age getAge() {
		return age;
	}
	public void setAge(Age age) {
		this.age = age;
	}
	
	
}
