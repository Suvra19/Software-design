package funkySignsModel;

import javax.swing.*;
import java.awt.*;

/**
 * A plain Sign that can be displayed but cannot change itself.
 * This is the basic building block of Signs; fancier Signs repeatedly
 * change one of these to achieve their effects.
 */
public class PlainSign extends Sign implements Graphic {

	/**
	 * Construct a Sign.
	 * @param theIcon The icon to be displayed.
	 */
	public PlainSign(Icon theIcon) {
		icon = theIcon;
		location = new Point(0, 0);
		rotation = 0;
   }

	/** Change the current Icon. */
	public void setIcon(Icon theIcon) {
		icon = theIcon;
    	update();
    }

	/** Getter for current Icon. */
	public Icon getIcon() {
    	return icon;
    }

	/** Move the top-left corner to the given coordinates. */
	public void setLocation(Point point) {
		location = point;
		update();
    }

	/** Getter for current location. */
	public Point getLocation() {
    	return new Point(location);
    }

	/** Change the rotation to the given number of degrees. */
	public void setRotation(int degrees) {
    	rotation = degrees % 360;
        if (rotation < 0)
        	rotation += 360;
        update();
    }

	/** Getter for current rotation in degrees. */
	public int getRotation() {
    	return rotation;
    }

	/** Return the outer bounds of this Sign. */
	public Rectangle getBounds() {
		return new Rectangle(location.x, location.y, icon.getIconWidth(), icon.getIconHeight());
	}
	
	/** Update this Sign's state.
	 *  Does nothing because PlainSigns are static.
	 */
	public void tick() {
		// Do nothing.
	}
}
