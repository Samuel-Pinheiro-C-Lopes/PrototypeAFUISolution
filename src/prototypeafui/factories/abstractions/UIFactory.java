package prototypeafui.factories.abstractions;

import prototypeafui.uielements.abstractions.Button;
import prototypeafui.uielements.abstractions.TextBox;
import prototypeafui.uielements.abstractions.Window;

public interface UIFactory {
	Window getWindow();
	Button getButton();
	TextBox getTextBox();
}
