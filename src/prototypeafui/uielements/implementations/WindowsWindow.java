package prototypeafui.uielements.implementations;

import prototypeafui.uielements.abstractions.Window;

public class WindowsWindow implements Window {
	public WindowsWindow() { }
	
	public WindowsWindow(WindowsWindow textBox) { }
	
	@Override
	public Window clone() {
		return new WindowsWindow(this);
	}
}

