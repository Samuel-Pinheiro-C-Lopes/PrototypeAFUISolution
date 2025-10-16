package prototypeafui.factories.abstractions;

import prototypeafui.enums.Color;
import prototypeafui.enums.Font;
import prototypeafui.uielements.abstractions.Button;
import prototypeafui.uielements.abstractions.TextBox;
import prototypeafui.uielements.abstractions.Window;

public interface UIFactory {
	Window getWindow(Color color);
	Button getButton(Color color);
	TextBox getTextBox(Font font);
}
