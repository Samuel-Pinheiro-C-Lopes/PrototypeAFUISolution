package prototypeafui.uielements.abstractions;

public interface Window extends UIElement {
	default void hide() {
		System.out.println(this.getName() + " is hiding itself.");
	}
	
	default void show() {
		System.out.println(this.getName() + " is showing itself.");
	}
	
	Window clone();
}
