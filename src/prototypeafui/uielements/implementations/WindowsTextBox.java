package prototypeafui.uielements.implementations;

import prototypeafui.uielements.abstractions.TextBox;

public class WindowsTextBox implements TextBox {
	public WindowsTextBox() { }
	
	public WindowsTextBox(WindowsTextBox textBox) { }
	
	@Override
	public TextBox clone() {
		return new WindowsTextBox(this);
	}
}

