package prototypeafui.uielements.abstractions;

public interface Window extends UIElement {
	default void hide() {
		System.out.println(this.getClass().getSimpleName() + " is hiding itself.");
	}
	
	default void show() {
		System.out.println(this.getClass().getSimpleName() + " is showing itself.");
	}
	
	Window clone();
}
