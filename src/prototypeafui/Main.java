package prototypeafui;

import prototypeafui.factories.abstractions.UIFactory;
import prototypeafui.factories.implementations.PrototypeFactory;
import prototypeafui.uielements.abstractions.Button;
import prototypeafui.uielements.abstractions.TextBox;
import prototypeafui.uielements.abstractions.Window;
import prototypeafui.uielements.implementations.MacButton;
import prototypeafui.uielements.implementations.MacTextBox;
import prototypeafui.uielements.implementations.MacWindow;
import prototypeafui.uielements.implementations.WindowsButton;
import prototypeafui.uielements.implementations.WindowsTextBox;
import prototypeafui.uielements.implementations.WindowsWindow;

public class Main {
	private static void init(UIFactory factory) {
		// elements we may want to render in the UI
		Button acceptButton = factory.getButton();
		Button addItemButton = factory.getButton();
		Button cancelButton = factory.getButton();
		
		Window confirmWindow = factory.getWindow();
		Window infoWindow = factory.getWindow();
		
		TextBox informalText = factory.getTextBox();
		TextBox formalCommonText = factory.getTextBox();
		TextBox formalImportantText = factory.getTextBox();
		
		
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
		final PrototypeFactory macFactory = new PrototypeFactory(new MacWindow(), new MacButton(), new MacTextBox());
		final PrototypeFactory windowsFactory = new PrototypeFactory(new WindowsWindow(), new WindowsButton(), new WindowsTextBox());		
		init(macFactory); // <- the kit of cloneable implementations of UIElements is decided here
	}
}
