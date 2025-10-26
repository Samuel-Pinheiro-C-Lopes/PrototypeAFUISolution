package prototypeafui.factories.implementations;

import prototypeafui.factories.abstractions.UIFactory;
import prototypeafui.uielements.abstractions.Button;
import prototypeafui.uielements.abstractions.TextBox;
import prototypeafui.uielements.abstractions.Window;

public class PrototypeFactory implements UIFactory {
	private final Window window;
	private final Button button;
	private final TextBox textBox;
	
	public PrototypeFactory(final Window window, final Button button, final TextBox textBox) {
		this.window = window;
		this.button = button;
		this.textBox = textBox;
	}
	
	@Override
	public Window getWindow() {
		return this.window.clone();
	}

	@Override
	public Button getButton() {
		return this.button.clone();
	}

	@Override
	public TextBox getTextBox() {
		return this.textBox.clone();
	}

}
