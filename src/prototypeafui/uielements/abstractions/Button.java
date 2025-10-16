package prototypeafui.uielements.abstractions;

public interface Button extends UIElement {
	default void click() {
		System.out.println(this.getName() + " is being clicked.");
	}
}
