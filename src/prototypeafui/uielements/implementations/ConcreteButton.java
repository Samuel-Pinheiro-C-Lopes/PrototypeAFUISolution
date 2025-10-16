package prototypeafui.uielements.implementations;

import prototypeafui.enums.Border;
import prototypeafui.enums.Color;
import prototypeafui.enums.Font;
import prototypeafui.uielements.abstractions.Button;

public class ConcreteButton implements Button {
	private String name;
	private Integer width;
	private Integer height;
	private Color color;
	private Font font;
	private Border border;
	
	public ConcreteButton() { }

	public ConcreteButton(String name, Integer width, Integer height, Color color, Border border, Font font) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.color = color;
		this.font = font;
		this.border = border;
	}
	
	public ConcreteButton(ConcreteButton button) {
		this(button.name, button.width, button.height, button.color, button.border, button.font);
	}
	
	@Override
	public ConcreteButton clone() {
		return new ConcreteButton(this);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
