package prototypeafui.uielements.implementations;

import prototypeafui.enums.Border;
import prototypeafui.enums.Color;
import prototypeafui.uielements.abstractions.Window;

public class ConcreteWindow implements Window {
	private String name;
	private Integer width;
	private Integer height;
	private Color color;
	private Border border;
	
	public ConcreteWindow() { }
	
	public ConcreteWindow(String name, Integer width, Integer height, Color color, Border border) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.color = color;
		this.border = border;
	}

	public ConcreteWindow(ConcreteWindow window) {
		this(window.name, window.width, window.height, window.color, window.border);
	}
	
	@Override
	public ConcreteWindow clone() {
		return new ConcreteWindow(this);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
