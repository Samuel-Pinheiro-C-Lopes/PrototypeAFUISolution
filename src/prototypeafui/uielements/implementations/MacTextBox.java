
package prototypeafui.uielements.implementations;

import prototypeafui.uielements.abstractions.TextBox;

public class MacTextBox implements TextBox {
	public MacTextBox() { }
	
	public MacTextBox(MacTextBox textBox) { }
	
	@Override
	public TextBox clone() {
		return new MacTextBox(this);
	}
}

