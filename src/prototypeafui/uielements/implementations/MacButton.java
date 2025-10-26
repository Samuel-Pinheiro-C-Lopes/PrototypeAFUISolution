package prototypeafui.uielements.implementations;

import prototypeafui.uielements.abstractions.Button;

public class MacButton implements Button {
	public MacButton() { }
	
	public MacButton(MacButton button) { }
	
	@Override
	public Button clone() {
		return new MacButton(this);
	}
}

