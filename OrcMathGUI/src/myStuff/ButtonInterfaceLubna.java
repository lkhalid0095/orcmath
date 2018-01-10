package myStuff;
import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.interfaces.Clickable;

public interface ButtonInterfaceLubna extends Clickable {

	void setColor(Color color);
	
	void setAction(Action a);
	void highlight();

	void dim();
	void getAButton();
	void setX(double d);
	void setY(double d);


}
