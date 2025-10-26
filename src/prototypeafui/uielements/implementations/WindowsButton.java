package prototypeafui.uielements.implementations;

import prototypeafui.uielements.abstractions.Button;

public class WindowsButton implements Button {
	public WindowsButton() { }
	
	public WindowsButton(WindowsButton textBox) { }
	
	@Override
	public Button clone() {
		return new WindowsButton(this);
	}
}

