package abstractFactory2;

public class AbstractFactoryPattern2 {

	public static void main(String[] args) {
		GuiFac fac = new LinuxGuiFac();
		TextArea text = fac.createTextArea();
		Button button = fac.createButton();
		System.out.println(text.getText() + button.getButton());
		
		GuiFac win = new WindowFac();
		TextArea text1 = win.createTextArea();
		Button button1 = win.createButton();
		System.out.println(text1.getText() + button1.getButton());
		
		// 맥도 같은 페턴으로 가능
		// 사용자는 따로 소환안해도 되도록 만들기
		GuiFac fac2 = FactoryInstance.getGuiFac();
		
	}
}
