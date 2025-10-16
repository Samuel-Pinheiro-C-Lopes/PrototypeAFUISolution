package prototypeafui;

import prototypeafui.enums.Color;
import prototypeafui.enums.Font;
import prototypeafui.factories.abstractions.UIFactory;
import prototypeafui.factories.implementations.MacUIFactory;
import prototypeafui.uielements.abstractions.Button;
import prototypeafui.uielements.abstractions.TextBox;
import prototypeafui.uielements.abstractions.Window;

public class Main {
	private static void init(UIFactory factory) {
		// elements we may want to render in the UI
		Button acceptButton = factory.getButton(Color.GREEN);
		Button addItemButton = factory.getButton(Color.GREEN);
		Button cancelButton = factory.getButton(Color.RED);
		
		Window confirmWindow = factory.getWindow(Color.GREEN);
		Window infoWindow = factory.getWindow(Color.BLUE);
		
		TextBox informalText = factory.getTextBox(Font.COMIC);
		TextBox formalCommonText = factory.getTextBox(Font.ARIAL);
		TextBox formalImportantText = factory.getTextBox(Font.ARIAL);
		
		
		// now interacting with them, supposing a user is clicking and using the application
		// (all these implementation details were abstracted from this example)
		
		// a specific modal is clicked
		infoWindow.draw(0, 100);
		infoWindow.show();

		// some text is rendered for the modal
		informalText.setText("description");
		formalImportantText.setText("many lines");
		formalCommonText.setText("at the bottom");
		
		informalText.draw(20, 10);
		formalImportantText.draw(50, 100);
		formalCommonText.draw(200, 200);
		
		// now the options for the form
		acceptButton.draw(180, 100);
		addItemButton.draw(100, 100);
		cancelButton.draw(180, 0);
		
		// user excludes some items and then decides to leave
		addItemButton.click();
		addItemButton.click();
		
		cancelButton.click();
		
		// confirmation
		confirmWindow.draw(50, 50);
		confirmWindow.show();
		
		// confirmation content [...] - abstracted, more UIElements could've been created
		
		// user confirms it
		confirmWindow.hide();		
		infoWindow.hide();

		// could do the same with the already created objects, ask for more or simply clone them 
		// right here
		// (the factory is actually a prototype manager underneath so the get methods aren't
		// that more expansive than cloning them directly)
	}
	
	public static void main(String[] agrs) {
		init(new MacUIFactory()); // <- the kit of cloneable implementations of UIElements is decided here
	}
}
