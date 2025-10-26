package prototypeafui.uielements.abstractions;

public interface Button extends UIElement {
	default void click() {
		System.out.println(this.getClass().getSimpleName() + " is being clicked.");
	}
	
	Button clone();
}
