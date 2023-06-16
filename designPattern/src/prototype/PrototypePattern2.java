package prototype;

// 깊은 복사와 얕은 복사 예시
public class PrototypePattern2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat na = new Cat();
		na.setName("na");
		na.setAge(new Age(2012, 3));
		
		// 나비를 복사하여 새로운 이름 생성
		Cat y = na;
		y.setName("yo");
		y.setAge(new Age(2013, 2));
		
		// 두 개의 주소가 같아서 하나 수정시 두개 다 바뀜 => 얕은 복사
		System.out.println(na.getName() + "," + na.getAge().getYear());
		System.out.println(y.getName() + "," + y.getAge().getYear());
		
		// 깊은복사
		na = y.copy();
		na.setName("navi");
		na.setAge(new Age(2012, 3));
		System.out.println(na.getName() + "," + na.getAge().getYear());
		System.out.println(y.getName() + "," + na.getAge().getYear());
		
		// 깊은복사가 일어나지 않고 자동으로 새로운 주소값으로 참조하는 경우
		y.setName("yo2");
		y.getAge().setYear(2017);
		y.getAge().setValue(7);
		System.out.println(na.getName() + "," + na.getAge().getYear());
		System.out.println(y.getName() + "," + na.getAge().getYear());
		
		// 깊은 복사 위해서는 cat클래스에서 해야함
	}
}
