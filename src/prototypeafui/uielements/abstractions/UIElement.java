package prototypeafui.uielements.abstractions;

public interface UIElement extends Cloneable {
	String getName();
	
	default void draw(Integer y, Integer x) {
		System.out.println(
				getName() + 
				" is being draw in the position x: "+ x + 
				" and position y: " + y + "."
				);
	}
	
	UIElement clone();
}
