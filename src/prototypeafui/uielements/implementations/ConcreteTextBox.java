package prototypeafui.uielements.implementations;

import prototypeafui.enums.Color;
import prototypeafui.enums.Font;
import prototypeafui.enums.TextFormat;
import prototypeafui.uielements.abstractions.TextBox;

public class ConcreteTextBox implements TextBox {
	private String name;
	private Integer width;
	private Integer height;
	private Color color;
	private Font font;
	private TextFormat format;
	
	public ConcreteTextBox() { }

	public ConcreteTextBox(String name, Integer width, Integer height, Color color, Font font, TextFormat format) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.color = color;
		this.font = font;
		this.format = format;
	}
	
	public ConcreteTextBox(ConcreteTextBox textBox) {
		this(textBox.name, textBox.width, textBox.height, textBox.color, textBox.font, textBox.format);
	}
	
	@Override
	public ConcreteTextBox clone() {
		return new ConcreteTextBox(this);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
