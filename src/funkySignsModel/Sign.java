package funkySignsModel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * A Sign is a graphic that knows what area it occupies.
 * It can be moved, or rotated around its center point.
 */
public abstract class Sign extends Spy implements Graphic{

	/** The Signs that make up this group. */
	protected List<Sign> signs;
	
	/** The visible content of this Sign. **/
	protected Icon icon;

	/** XY coordinates of the top-left corner of the Sign. **/
	protected Point location;
	
	/** Degrees clockwise rotation of the Sign. **/
	protected int rotation;
	
	/** Set the Sign's image.
	 *  @param icon The Icon to display. The Sign resizes to match the Icon.
	 */
	public abstract void setIcon(Icon icon);
	
	/** Getter for this Sign's image. */
	public abstract Icon getIcon();

	/** Move the Sign to an absolute position.
	 *  @param point Coordinates for the top-left corner of the Sign.
	 */
	public abstract void setLocation(Point point);

	/** Getter for top-left corner of Sign. */
	public abstract Point getLocation();

	/** Set the absolute clockwise rotation of the Sign
	 *  @param degrees How many degrees the Sign should be turned from vertical.
	 */
	public abstract void setRotation(int degrees);

	/** Getter for clockwise rotation of this Sign in degrees. */
	public abstract int getRotation();

	/** Get a rectangle describing the area currently occupied by the Sign. */
	public abstract Rectangle getBounds();
	
	/**
	 * Add a sign to this group of signs
	 * @param theSign the Sign to add
	 */
	public void addSign(Sign aSign) {}
	
	/** Update the Sign's state. */
	public abstract void tick();
}
