package abstractFactory2;

public class WindowFac implements GuiFac {

	@Override
	public Button createButton() {
		return new WindowButton();
		
	}

	@Override
	public TextArea createTextArea() {
		return new WindowTextArea();
	}

}
