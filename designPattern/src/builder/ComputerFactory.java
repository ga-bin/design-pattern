package builder;

public class ComputerFactory {

	private BluePrint print;
	
	// 방법2 여기서 인자값을 private String cpu ram만들고 직접 값을 넣어준 후
	public void setPrint(BluePrint print) {
		this.print = print;
	}
	
	public void make() {
		print.setCpu();
		print.setRam();
		print.setStorage();
	}
	
	public Computer getComputer() {
		// 여기에서 new로 컴퓨터 만들어서 return 해도된다.
		return print.getComputer();
	}
	
	
}
