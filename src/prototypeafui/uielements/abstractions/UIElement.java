package prototypeafui.uielements.abstractions;

public interface UIElement extends Cloneable {	
	default void draw(Integer y, Integer x) {
		System.out.println(
				getClass().getSimpleName() + 
				" is being draw in the position x: "+ x + 
				" and position y: " + y + "."
				);
	}
	
	UIElement clone();
}
