package builder;

// 복잡한 단계가 필요한 인스턴스의 생성
public class BuilderPattern { 
	public static void main(String[] args) {
		Computer computer = new Computer("17", "16G", "256SSD");
		System.out.println(computer.toString());
		
		// 인자 값이 많아질 경우 출력 힘들고 복잡해짐
		// => 생성을 다른 객체(빌더)로 넘김
		ComputerFactory factory = new ComputerFactory(); 
		factory.setPrint(new LgGramBlueprint());
		factory.make();
		
		// 설계도를 만들어서 가지고옴
		Computer computer4 = factory.getComputer();
		System.out.println(computer.toString());
	}
}
