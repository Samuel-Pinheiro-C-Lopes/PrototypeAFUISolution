package prototypeafui.factories.implementations;

import java.util.HashMap;

import prototypeafui.enums.Border;
import prototypeafui.enums.Color;
import prototypeafui.enums.Font;
import prototypeafui.enums.TextFormat;
import prototypeafui.factories.abstractions.UIFactory;
import prototypeafui.uielements.abstractions.Button;
import prototypeafui.uielements.abstractions.TextBox;
import prototypeafui.uielements.abstractions.Window;
import prototypeafui.uielements.implementations.ConcreteButton;
import prototypeafui.uielements.implementations.ConcreteTextBox;
import prototypeafui.uielements.implementations.ConcreteWindow;

public class WindowsUIFactory implements UIFactory {
	private static final String PRE_FIX = "Windows";
	
	private HashMap<Color, ConcreteWindow> windows;
	private HashMap<Color, ConcreteButton> buttons;
	private HashMap<Font, ConcreteTextBox> textBoxes;
	
	public WindowsUIFactory() { 
		this.windows = new HashMap<Color, ConcreteWindow>();
		this.buttons = new HashMap<Color, ConcreteButton>();
		this.textBoxes = new HashMap<Font, ConcreteTextBox>();
	}

	@Override
	public Window getWindow(Color color) {
		if (!this.windows.containsKey(color))
			this.windows.put(color, new ConcreteWindow(PRE_FIX + " Window", 150, 150, color, Border.RETACLE));
		
		return this.windows.get(color).clone();
	}

	@Override
	public Button getButton(Color color) {
		if (!this.buttons.containsKey(color))
			this.buttons.put(color, new ConcreteButton(PRE_FIX + " Button", 40, 25, color, Border.RETACLE, Font.ARIAL));
		
		return this.buttons.get(color).clone();
	}

	@Override
	public TextBox getTextBox(Font font) {
		if (!this.textBoxes.containsKey(font))
			this.textBoxes.put(font, new ConcreteTextBox(PRE_FIX + " TextBox", 120, 150, Color.GREEN, font, TextFormat.LEFT));
		
		return this.textBoxes.get(font).clone();
	}
}
