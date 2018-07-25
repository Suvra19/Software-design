
package funkySignsModel;

import java.awt.*;
import javax.swing.*;

/**
 * An active Sign that wraps around an inner Sign and updates when tick()
 * is called.  Subclasses provide the specific behaviour, such as
 * updating the icon or moving.
 */
public abstract class DynamicSign extends Sign implements Graphic {

    /** The wrapped Sign. */
    protected Sign baseSign;

	/**
	 * Construct a DynamicSign.
	 * @param updateInterval Sign to be wrapped.
	 */
	public DynamicSign(Sign theBaseSign) {
		baseSign = theBaseSign;
    }

	/** Set the Sign's image.
	 *  @param icon The Icon to display. The Sign resizes to match the Icon.
	 */
	public void setIcon(Icon icon) {
		baseSign.setIcon(icon);
	}
	
	/** Getter for this Sign's image. */
	public Icon getIcon() {
		return baseSign.getIcon();
	}
	
	
	/** Move the Sign to an absolute position.
	 *  @param point Coordinates for the top-left corner of the Sign.
	 */
	public void setLocation(Point point) {
    	baseSign.setLocation(point);
    }

	/** Getter for top-left corner of Sign. */
	public Point getLocation() {
    	return baseSign.getLocation();
    }

	/** Set the absolute clockwise rotation of the Sign
	 *  @param degrees How many degrees the Sign should be turned from vertical.
	 */
	public void setRotation(int degrees) {
    	baseSign.setRotation(degrees);
    }

	/** Getter for clockwise rotation of this Sign in degrees. */
	public int getRotation() {
    	return baseSign.getRotation();
    }

	/** Get a rectangle describing the area currently occupied by the Sign. */
	public Rectangle getBounds() {
		return baseSign.getBounds();
	}
	
	/** Update the Sign's state. */
	public void tick() {
        baseSign.tick();
    }
}
