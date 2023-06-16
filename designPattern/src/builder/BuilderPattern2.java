package builder;

public class BuilderPattern2 {

	public static void main(String[] args) {
		Computer computer2 = ComputerBuilder
								.startWithCpu("i7")
								.setRam("8G")
								.setStorage("128G SSD")
								.build();
		
		System.out.println(computer2.toString());
	}
}
