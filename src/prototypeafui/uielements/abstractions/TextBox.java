package prototypeafui.uielements.abstractions;

public interface TextBox extends UIElement {
	default void setText(String text) {
		System.out.println(this.getClass().getSimpleName() + " is receiving the text " + text + ".");
	}
	
	TextBox clone();
}
